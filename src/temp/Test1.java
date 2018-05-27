package temp;

public class Test1 {
    private double r, h, sa, volume;
    public Test1(double R, double H){
        this.r=R;
        this.h=H;
    }
    public double getRadius() {return r;}
    public double getHeight() {return 0.0;}
    public double getSurfaceArea() {sa=(Math.PI)*r*r; return sa;}
    public double getVolume() {return 0.0;}
}
