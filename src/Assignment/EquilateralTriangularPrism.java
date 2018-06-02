package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquilateralTriangularPrism extends EquilateralTriangle {
    private double nHeight, area, volume=0;
    private boolean flag=false;
    public EquilateralTriangularPrism(){
        super();
        while(!flag){
            try {
                Thread.sleep(100);
                System.out.print("\nPlease input Normal Height: ");
                nHeight=input.nextDouble();
                if(nHeight<=0) throw new CustomException("Error: Normal height should be positive");

                area=getArea();
                volume=getVolume();
                flag=true;
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

    @Override
    public double getArea() {
        double distance[]=returnDistance();
        return super.getArea()*2+(distance[0]+distance[1]+distance[2])*nHeight;
    }

    public double getVolume(){
        return super.getArea()*nHeight;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String printExtra(){
        return "\n\tNormal Height: "+df.format(nHeight)+
                "\n\tSurface Area: "+df.format(area)+
                "\n\tVolume: "+df.format(volume);
    }
}