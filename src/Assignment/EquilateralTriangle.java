package Assignment;

import java.util.*;
import static java.lang.Math.*;

public class EquilateralTriangle implements Shapes{
    public static final int TRIANGLE=3;
    private Poin2D vertex[]=new Poin2D[TRIANGLE];
    private double distance[]=new double[TRIANGLE];
    private double area;
    private boolean flag=false;
    Scanner input=new Scanner(System.in);

    public EquilateralTriangle(){
        while(!flag){
            try {
                Thread.sleep(100);
                // To print "System.out.println" after "System.err.println"
                // They use different thread on compiler.
                // Therefore, if there is no thread sleep, they printed in a different order on compiler.
                System.out.println("\n  === "+getClass().getSimpleName()+" ===");
                for (int i = 0; i < TRIANGLE; i++) {
                    vertex[i] = new Poin2D();
                    System.out.printf("Please input x-coordinate of the Vertex%d of the triangle: ", i + 1);
                    vertex[i].setX(input.nextDouble());
                    System.out.printf("Please input y-coordinate of the Vertex%d of the triangle: ", i + 1);
                    vertex[i].setY(input.nextDouble());
                }
                distance[0] = getDistance(vertex[0], vertex[1]);
                distance[1] = getDistance(vertex[1], vertex[2]);
                distance[2] = getDistance(vertex[2], vertex[0]);
                double[] slant=new double[TRIANGLE];
                slant[0]=(vertex[0].getY()-vertex[1].getY())/(vertex[0].getX()-vertex[1].getX());
                slant[1]=(vertex[1].getY()-vertex[2].getY())/(vertex[1].getX()-vertex[2].getX());
                slant[2]=(vertex[2].getY()-vertex[0].getY())/(vertex[2].getX()-vertex[0].getX());
                if (slant[0]==slant[1]||slant[1]==slant[2]||slant[2]==slant[0])
                    throw new CustomException("Error: the three vertices are collinear. " +
                        "Please enter non-collinear vertices");
                if(distance[0]==0||distance[1]==0||distance[2]==0)
                    throw new CustomException("Error: this is not a triangle. " +
                            "Please enter valid vertices that make the triangle.");
                flag = true;
                area=getArea();
                if (!(distance[0] == distance[1] && distance[1] == distance[2] && distance[2] == distance[0]))
                    throw new CustomException("Warning: the three sides are not equal, but continue your operation");
            } catch (CustomException ce) {
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
    // there is already getDistance method that occurs name duplication
    public double[] returnDistance() {
        return distance;
    }

    @Override
    public double getDistance(Poin2D A, Poin2D B) {
        return sqrt((A.getX()-B.getX())*(A.getX()-B.getX())+
                (A.getY()-B.getY())*(A.getY()-B.getY()));
    }

    @Override
    public double getArea() {
        return Math.abs((vertex[0].getX()*vertex[1].getY()+vertex[1].getX()*vertex[2].getY()+vertex[2].getX()*vertex[0].getY())-
                (vertex[0].getX()*vertex[2].getY()+vertex[2].getX()*vertex[1].getY()+vertex[1].getX()*vertex[0].getY()))/2;
    }

    @Override
    public String toString() {
        return "\nType of shape: "+getClass().getSimpleName()+
                "\n\tCoordinates of Vertex 1: "+df.format(vertex[0].getX())+", "+df.format(vertex[0].getY())+
                "\n\tCoordinates of Vertex 2: "+df.format(vertex[1].getX())+", "+df.format(vertex[1].getY())+
                "\n\tCoordinates of Vertex 3: "+df.format(vertex[2].getX())+", "+df.format(vertex[2].getY())+
                "\n\tLength of side 1: "+df.format(distance[0])+
                "\n\tLength of side 2: "+df.format(distance[1])+
                "\n\tLength of side 3: "+df.format(distance[2]);
    }

    public String printExtra(){
        return "\n\tSurface Area: "+df.format(area);
    }
}