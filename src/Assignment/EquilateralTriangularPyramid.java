package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquilateralTriangularPyramid extends EquilateralTriangularPrism {
    private double sHeight, area, volume=0;
    private boolean flag=false, sHeightFlag=false;
    public EquilateralTriangularPyramid(){
        super();
        while(!flag){
            try {
                Thread.sleep(100);
                if(!sHeightFlag) System.out.print("\nPlease input Slant Height: ");
                else System.out.print("\nPlease input correct Slant Height: ");
                setsHeight(input.nextDouble());
                if(sHeight<=getnHeight()) throw new CustomException(
                        "Error: Slant Height should be larger than normal Height.");
                flag=true;
                setArea(getArea());
                setVolume(getVolume());
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

    //---setter---
    public void setsHeight(double sHeight) {
        this.sHeight=sHeight;
    }
    public void setArea(double area){
        this.area=area;
    }
    public void setVolume(double volume){
        this.volume=volume;
    }

    @Override
    public double getArea() {
        return getBaseArea()+getBaseLength()*sHeight/2;
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
