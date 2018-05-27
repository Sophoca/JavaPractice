package Lab4;    // Fig 3.8

public class Account {
    private String name;
    private int number;         // 1.1. add account number
    private double balance;

    public Account(){}
    public Account(String name, int number, double balance){
        this.name=name;
        this.number=number;     // 1.2. modify constructor
        if(balance>0.0) this.balance=balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount>0.0) balance+=depositAmount;
    }

    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public void withdraw(double amount){        // 1.3. add method
        System.out.println(this.name+" tries to withdraw $"+amount);
        if(amount>this.balance) System.out.println("There is not enough money!");
        else {
            System.out.println(this.name + " witdrawes $" + amount);
            this.balance -= amount;
        }
    }

    public boolean authenticate(int account_number){    // 1.4. add method
        if(account_number==this.number){
            //System.out.print(this.name+"'s account number is "+account_number);
            return true;
        }
        else{
            //System.out.print(this.name+"'s account number is not "+account_number);
            return false;
        }
    }

    public String toString() {
        return "name: "+name+"\naccount number: "+number+
                "\ninitial balance: "+balance+"\n";
    }
}
