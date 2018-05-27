package Lab5;    // Fig 3.8

public class Account {
    private String name;
    //---------Question 3---------
    private int accountNo;
    static private int no=1000;
    private double balance;

    public Account(String name, double balance){
        this.name=name;
        if(balance>0.0) this.balance=balance;
        accountNo=getNo();
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    //---------Question 2---------
    Boolean transfer(Account b, double amt){
        if(this.balance>=amt){
            b.balance+=amt;
            this.balance-=amt;
            return true;
        }
        else return false;
    }

    private int getNo(){
        return ++no;
    }

    public int getAccountNo(){
        return accountNo;
    }
}
