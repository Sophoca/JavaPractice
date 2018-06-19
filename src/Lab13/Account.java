package Lab13;// Fig. 15.9: Account.java
// Serializable Account class for storing records as objects.
import java.io.Serializable;

public class Account implements Serializable
{
   private int account;
   private String name;
   private double balance;
   
   // initializes an Account with default values
   public Account() 
   {
      this("", 0, 0.0); // call other constructor
   } 
  
   // initializes an Account with provided values
   public Account(String name, int account, double balance)
   {
      this.account = account;
      this.name = name;
      this.balance = balance;
   }

   // set account number   
   public void setAccount(int account)
   {
      this.account = account;
   } 

   // get account number   
   public int getAccount() 
   { 
      return account; 
   } 

   // set last name   
   public void setName(String name)
   {
      this.name = name;
   } 

   // get last name   
   public String getName()
   {
      return name;
   } 
   
   // set balance  
   public void setBalance(double balance)
   {
      this.balance = balance;
   } 

   // get balance   
   public double getBalance() 
   { 
      return balance; 
   } 
} // end class AccountRecordSerializable


/*************************************************************************
* (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/