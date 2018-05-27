// written by 201720813
package Lab3;    // Fig 2.7
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, sum;
        System.out.print("Enter first Double: ");
        number1=input.nextDouble();
        System.out.print("Enter second Double: ");
        number2=input.nextDouble();
        sum=number1+number2;
        System.out.printf("Sum is %f%n", sum);
    }
}
