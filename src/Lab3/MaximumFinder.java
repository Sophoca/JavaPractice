// written by 201720813
package Lab3;    // Fig 6.3
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three floating-point values \nseparated by spaces: ");
        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();

        double result=maximum(number1, number2, number3);
        double average=average(number1, number2, number3);
        System.out.printf("Maximum is %.3f%n", result);
        System.out.printf("Average is %.3f%n", average);
    }

    public static double maximum(double x, double y, double z){
        double maximumValue = x;
        if(y>maximumValue) maximumValue=y;
        if(z>maximumValue) maximumValue=z;

        return maximumValue;
    }

    public static double average(double x, double y, double z){
        double sum=x+y+z;
        return sum/3;
    }
}
