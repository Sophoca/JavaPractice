package Lab5;    // Fig 6.3
import java.util.Scanner;
import java.lang.Math;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three floating-point values separated by spaces: ");
        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();

        double result=maximum(number1, number2, number3);
        System.out.printf("Maximum is %.3f%n", result);
    }

    public static double maximum(double x, double y, double z){
        double maximumValue = x;
        maximumValue=Math.max(maximumValue, y);
        maximumValue=Math.max(maximumValue, z);

        return maximumValue;
    }
}
