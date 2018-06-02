package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquarePyramid extends SquarePrism {
    private double sHeight, area, volume;
    private boolean flag=false, sHeightFlag=false;
    public SquarePyramid(){
        super();
        while(!flag){
            try {
                Thread.sleep(100);
                if(!sHeightFlag) System.out.print("\nPlease input Slant Height: ");
                else System.out.print("\nPlease input correct Slant Height: ");
                sHeight=input.nextDouble();
                if(sHeight<=getnHeight()) throw new CustomException(
                        "Error: Slant Height should be larger than normal Height.");
                flag=true;
                area=getArea();
                volume=getVolume();
            } catch (CustomException ce) {
                System.err.println("\n"+ce.getMessage());
                sHeightFlag=true;
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
        return getBaseArea()+super.returnDistance()*2*sHeight;
    }

    @Override
    public double getVolume(){
        return getBaseArea()*getnHeight()/3;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String printExtra(){
        return "\n\tSlant Height: "+df.format(sHeight)+
                "\n\tSurface Area: "+df.format(area)+
                "\n\tVolume: "+df.format(volume);
    }
}
