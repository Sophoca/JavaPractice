package Assignment;

public class TestShapes {
    public static void main(String[] args) {

        System.out.println("<INPUT>");
        EquilateralTriangle eTriangle=new EquilateralTriangle();
        Square square=new Square();
        //Polymorphism
        EquilateralTriangle eTriPrism=new EquilateralTriangularPrism();
        Square sPrism=new SquarePrism();
        //nonPolymorphism
        EquilateralTriangularPyramid eTriPyramid=new EquilateralTriangularPyramid();
        SquarePyramid sPyramid=new SquarePyramid();

        System.out.println("\n<OUTPUT>");
        System.out.println(eTriangle.toString()+eTriangle.printExtra());
        System.out.println(square.toString()+square.printExtra());
        System.out.println(eTriPrism.toString()+eTriPrism.printExtra());
        System.out.println(sPrism.toString()+sPrism.printExtra());
        System.out.println(eTriPyramid.toString()+eTriPyramid.printExtra());
        System.out.println(sPyramid.toString()+sPyramid.printExtra());
    }
}
