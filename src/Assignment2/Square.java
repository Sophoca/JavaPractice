package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Square implements Shapes {
    public static final int SQUARE=2;
    private Poin2D vertex[]=new Poin2D[SQUARE];
    private double distance, area;
    private boolean flag=false;
    Scanner input=new Scanner(System.in);

    public Square(){
        while(!flag){
            try{
                Thread.sleep(100);
                // To print "System.out.println" after "System.err.println"
                // They use different thread on compiler.
                // Therefore, if there is no thread sleep, they printed in a different order on console.
                System.out.println("\n  === "+getClass().getSimpleName()+" ===");
                vertex[0]=new Poin2D();
                System.out.print("Please input x-coordinate of Upper Left Vertex of the square: ");
                vertex[0].setX(input.nextDouble());
                System.out.print("Please input y-coordinate of Upper Left Vertex of the square: ");
                vertex[0].setY(input.nextDouble());
                vertex[1]=new Poin2D();
                System.out.print("Please input x-coordinate of Lower Right Vertex of the square: ");
                vertex[1].setX(input.nextDouble());
                System.out.print("Please input y-coordinate of Lower Right Vertex of the square: ");
                vertex[1].setY(input.nextDouble());

                if(vertex[0].getX()>=vertex[1].getX())
                    throw new CustomException("Error: x-coordinate of upper left vertex should be " +
                            "less than x-coordinate of lower right vertex." +
                            "\nPlease enter valid coordinates.");
                if(vertex[0].getY()<=vertex[1].getY())
                    throw new CustomException("Error: y-coordinate of upper left vertex should be " +
                            "less than y-coordinate of lower right vertex." +
                            "\nPlease enter valid coordinates.");
                getDistance(vertex[0], vertex[1]);
                if(distance==0)
                    throw new CustomException("Error: this is not a square. " +
                            "Please enter valid vertices that make the square.");
                flag=true;
                area=getArea();
            } catch (CustomException ce){
                System.err.println("\n"+ce.getMessage());
            } catch (InputMismatchException ie){
                input=new Scanner(System.in);
                System.err.println("\nError: Please enter only double(int) type value.");
            } catch (Exception e){
                System.err.println("\n"+e.getMessage());
            }
        }
    }

    //---getter---
    public double returnDistance(){ return distance; }
    public Poin2D[] getVertex() {
        return vertex;
    }

    @Override
    public double getDistance(Poin2D A, Poin2D B) {
        distance=0;
        if((A.getY()-B.getY())==(B.getX()-A.getX())) distance=A.getY()-B.getY();
        return distance;
    }

    @Override
    public double getArea() {
        return distance*distance;
    }

    @Override
    public String toString() {
        return "\nType of shape: "+getClass().getSimpleName()+
                "\n\tCoordinates of upper left vertex: "+df.format(vertex[0].getX())+", "+df.format(vertex[0].getY())+
                "\n\tCoordinates of lower right vertex: "+df.format(vertex[1].getX())+", "+df.format(vertex[1].getY())+
                "\n\tSide of square: "+df.format(distance);
    }

    public String printExtra(){
        return "\n\tSurface Area: "+df.format(area);
    }
}