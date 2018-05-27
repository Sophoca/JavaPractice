package Lab7;    // Fig 3.9

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account a1=new Account("A", 50.00);
        Account a2=new Account("Hong Kil-Dong");
        System.out.printf("%s balance: $%.2f%n",
                a1.getName(), a1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                a2.getName(), a2.getBalance());
        /*
        Scanner input=new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount=input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        a1.deposit((depositAmount));

        System.out.printf("%s balance: $%.2f%n", a1.getName(), a1.getBalance());
        System.out.printf("%s balance: $%.2f%n", a2.getName(), a2.getBalance());
        //a2=a1;
        System.out.println("Enter deposit amount for account2: ");
        depositAmount=input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        a2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", a1.getName(), a1.getBalance());
        System.out.printf("%s balance: $%.2f%n", a2.getName(), a2.getBalance());
        */
    }
}
