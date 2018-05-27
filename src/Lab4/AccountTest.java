package Lab4;    // Fig 3.2

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account A=new Account("Lee", 1111, 1000.00);
        Account B=new Account("Kim", 2222, 2000.00);
        Account C=new Account("Hong", 3333, 3000.00);

        Scanner input = new Scanner(System.in);
        int account;
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println("----------------\n");
        A.withdraw(1200.00);
        System.out.println("");
        System.out.println(A.toString());
        System.out.println("----------------\n");
        A.withdraw(500);
        System.out.println("");
        System.out.println(A.toString());
        System.out.println("----------------\n");
        System.out.print("Input account number: ");
        account=input.nextInt();
        if(A.authenticate(account) || B.authenticate(account) || C.authenticate(account)){
            System.out.println("Match!");
        }
        else System.out.println("Not match!");
        System.out.println("\n----------------\n");
        System.out.print("Input account number: ");
        account=input.nextInt();
        if(A.authenticate(account) || B.authenticate(account) || C.authenticate(account)){
            System.out.println("Match!");
        }
        else System.out.println("Not match!");
    }
}

