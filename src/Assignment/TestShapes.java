package Assignment;

public class TestShapes {
    public static void main(String[] args) {
        System.out.println("<INPUT>");
        //EquilateralTriangle eTriangle=new EquilateralTriangle();
        //Square square=new Square();
        EquilateralTriangularPrism eTriPrism=new EquilateralTriangularPrism();
        SquarePrism sPrism=new SquarePrism();


        System.out.println("\n<OUTPUT>");
        //System.out.println(eTriangle.toString()+eTriangle.printExtra());
        //System.out.println(square.toString()+square.printExtra());
        System.out.println(eTriPrism.toString()+eTriPrism.printExtra());
        System.out.println(sPrism.toString()+sPrism.printExtra());
    }
}
