package Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquarePrism extends Square {
    private double nHeight, lArea, baseArea, area, volume;
    private boolean flag=false, nHeightFlag=false;
    public SquarePrism(){
        super();
        while(!flag){
            try {
                Thread.sleep(100);
                if(!nHeightFlag) System.out.print("\nPlease input Normal Height: ");
                else System.out.print("\nPlease input positive value for Normal Height: ");
                setnHeight(input.nextDouble());
                if(nHeight<=0) throw new CustomException("Error: Normal height should be positive");
                flag=true;
                setArea(getArea());
                setVolume(getVolume());
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

    //---setter---
    public void setnHeight(double nHeight) {
        this.nHeight=nHeight;
    }
    public void setArea(double area){
        this.area=area;
    }
    public void setVolume(double volume){
        this.volume=volume;
    }

    //---getter---
    public double getBaseArea(){
        return super.getArea();
    }
    public double getLateralArea(){
        return super.returnDistance()*4*nHeight;
    }
    public double getnHeight() {
        return nHeight;
    }

    @Override
    public double getArea() {
        lArea=getLateralArea();
        return getBaseArea()*2+lArea;
    }

    public double getVolume(){
        return getBaseArea()*nHeight;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tNormal Height: "+df.format(nHeight);
    }

    @Override
    public String printExtra(){
        return "\n\tLateral Surface Area: "+df.format(lArea)+
                "\n\tSurface Area: "+df.format(area)+
                "\n\tVolume: "+df.format(volume);
    }
}
