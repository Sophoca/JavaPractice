package Lab5;    // Fig 3.9

public class AccountTest {
    public static void main(String[] args) {
        Account a=new Account("A", 100.00);
        Account b=new Account("B", 100.00);
        Account c=new Account("C", 100.00);

        //---------Question 2----------
        System.out.println("---------Question 2----------");
        System.out.printf("%s balance: $%.2f%n",
                a.getName(), a.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                b.getName(), b.getBalance());
        a.transfer(b, 30);
        System.out.println("Calling the transfer method!!");
        System.out.printf("%s balance: $%.2f%n",
                a.getName(), a.getBalance());
        System.out.printf("%s balance: $%.2f%n",
                b.getName(), b.getBalance());

        //---------Question 3----------
        System.out.println("\n---------Question 3----------");
        System.out.printf("%s's account number:%d\n%s's account number:%d\n" +
                "%s's account number:%d\n", a.getName(), a.getAccountNo(),
                b.getName(), b.getAccountNo(), c.getName(), c.getAccountNo());
    }
}
