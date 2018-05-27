package Assignment;

import java.util.*;

import static java.lang.Math.*;

public class EquilateralTriangle implements Shapes{
    public static final int TRIANGLE=3;
    private Poin2D vertex[];
    private double distance, area;

    public EquilateralTriangle(Poin2D vertex[]){
        this.vertex=vertex;
    }

    @Override
    public double getDistance(Poin2D A, Poin2D B) {
        distance=sqrt((A.getX()-B.getX())*(A.getX()-B.getX())+
                (A.getY()-B.getY())*(A.getY()-B.getY()));
        return distance;
    }

    @Override
    public double getArea() {
        area=Math.abs((vertex[0].getX()*vertex[1].getY()+vertex[1].getX()*vertex[2].getY()+vertex[2].getX()*vertex[0].getY())-
                (vertex[0].getX()*vertex[2].getY()+vertex[2].getX()*vertex[1].getY()+vertex[1].getX()*vertex[0].getY()))/2;
        return area;
    }

    @Override
    public String toString() {
        System.out.println("\nType of shape: Equilateral Triangle");
        for(int i=0; i<TRIANGLE; i++){
            System.out.printf("\tCoordinates of Vertex %d point: %.1f, %.1f\n",
                    i+1, vertex[i].getX(), vertex[i].getY());
        }
        for(int i=0; i<TRIANGLE; i++){
            if(i==TRIANGLE-1) System.out.printf("\tLength of side %d: %.1f\n",
                    i+1, getDistance(vertex[i], vertex[0]));
            else System.out.printf("\tLength of side %d: %.1f\n",
                    i+1, getDistance(vertex[i], vertex[i+1]));
        }
        System.out.printf("\tSurface Area: %.1f\n", getArea());

        return super.toString();
    }
}