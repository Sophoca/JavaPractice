package Assignment;

public class EquilateralSquare implements Shapes{
    public static final int SQUARE=2;
    private Poin2D vertex[];
    private double distance, area;

    public EquilateralSquare(Poin2D vertex[]){
        this.vertex=vertex;
    }

    @Override
    public double getDistance(Poin2D A, Poin2D B) {
        if((A.getY()-B.getY())==(B.getX()-A.getX())) distance=A.getY()-B.getY();
        return distance;
    }

    @Override
    public double getArea() {
        area=distance*distance;
        return area;
    }

    @Override
    public String toString() {
        System.out.println("\nType of shape: Square");
        System.out.printf("\tCoordinates of upper left vertex: %.1f, %.1f\n",
                vertex[0].getX(), vertex[0].getY());
        System.out.printf("\tCoordinates of lower right vertex: %.1f, %.1f\n",
                vertex[1].getX(), vertex[1].getY());
        System.out.printf("\tSide of a Square: %.1f\n", getDistance(vertex[0], vertex[1]));
        System.out.printf("\tSurface Area: %.1f\n", getArea());
        return super.toString();
    }
}