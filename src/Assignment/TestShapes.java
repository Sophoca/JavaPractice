package Assignment;

import java.util.Scanner;

import static Assignment.EquilateralSquare.SQUARE;
import static Assignment.EquilateralTriangle.TRIANGLE;

public class TestShapes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Poin2D triangle[]=new Poin2D[TRIANGLE];
        Poin2D square[]=new Poin2D[SQUARE];
        double x, y, height, sheight;

        System.out.println("  === Equilateral Triangle ===");
        for(int i=0; i<TRIANGLE; i++){
            System.out.printf("Please input x-coordinate of the Vertex%d of the triangle: ", i+1);
            x=input.nextDouble();
            System.out.printf("Please input y-coordinate of the Vertex%d of the triangle: ", i+1);
            y=input.nextDouble();
            triangle[i]=new Poin2D(x, y);
        }
        EquilateralTriangle et=new EquilateralTriangle(triangle);

        System.out.println("\n  === Square ===");
        System.out.printf("Please input x-coordinate of the Upper Left of the square: ");
        x=input.nextDouble();
        System.out.printf("Please input y-coordinate of the Upper Left of the square: ");
        y=input.nextDouble();
        square[0]=new Poin2D(x, y);
        System.out.printf("Please input x-coordinate of the Lower Right of the square: ");
        x=input.nextDouble();
        System.out.printf("Please input y-coordinate of the Lower Right of the square: ");
        y=input.nextDouble();
        square[1]=new Poin2D(x, y);
        EquilateralSquare es=new EquilateralSquare(square);

        et.toString();
        es.toString();
    }
}
