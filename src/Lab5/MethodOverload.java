package Lab5;    // Fig 6.10

public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
        System.out.printf("Square of string hello is %s%n", square("hello"));
    }

    public static int square(int intValue){
        System.out.printf("%nCalled square with int argument: %d%n", intValue);
        return intValue*intValue;
    }

    public static double square(double doubleValue){
        System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
        return doubleValue*doubleValue;
    }

    /*--------Question 4-b-------
    public static double square(int n){
        return (double)n*n;
    }
    */

    //---------Question 4-a-------
    public static String square(String stringValue){
        System.out.printf("%nCalled square with double argument: %s%n", stringValue);
        String temp=stringValue+stringValue;
        return temp;
    }
}
