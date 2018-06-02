package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquilateralTriangularPrism extends EquilateralTriangle {
    private double nHeight, baseLength, area, baseArea, volume=0;
    private boolean flag=false, nHeightFlag=false;
    public EquilateralTriangularPrism(){
        super();
        while(!flag){
            try {
                Thread.sleep(100);
                if(!nHeightFlag) System.out.print("\nPlease input Normal Height: ");
                else System.out.print("\nPlease input positive value for Normal Height: ");
                nHeight=input.nextDouble();
                if(nHeight<=0)
                    throw new CustomException("Error: Normal height should be positive");
                flag=true;
                area=getArea();
                volume=getVolume();
            } catch (CustomException ce) {
                System.err.println("\n"+ce.getMessage());
                nHeightFlag=true;
            } catch (InputMismatchException ie){
                input=new Scanner(System.in);
                System.err.println("\nError: Please enter only double(int) type value.");
            } catch (Exception e){
                System.err.println("\n"+e.getMessage());
            }
        }
    }

    //---getter---
    public double getnHeight() {
        return nHeight;
    }
    public double getBaseArea(){
        return super.getArea();
    }
    public double getBaseLength(){
        double distance[]=returnDistance();
        return distance[0]+distance[1]+distance[2];
    }

    @Override
    public double getArea() {
        baseArea=getBaseArea();
        baseLength=getBaseLength();
        return baseArea*2+baseLength*nHeight;
    }

    public double getVolume(){
        return super.getArea()*nHeight;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tNormal Height: "+df.format(nHeight);
    }

    @Override
    public String printExtra(){
        return "\n\tSurface Area: "+df.format(area)+
                "\n\tVolume: "+df.format(volume);
    }
}
