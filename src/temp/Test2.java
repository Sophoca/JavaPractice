package temp;

public class Test2 extends Test1 {
    private double r, h, sa, volume;
    public Test2(double R, double H){
        super(R, H);
        this.h=H;
    }
    public double getHeight(){ return h; }
    public double getVolume(){
        volume=getSurfaceArea()*h;
        return volume;
    }
}
