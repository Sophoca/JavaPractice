package Lab13;// Fig. 15.11: AccountTest.java
// Reading a file of objects sequentially with ObjectInputStream
// and displaying each record.

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AccountTest
{
   private static Scanner input;
   private static Formatter output;
   private static Account[] account=new Account[3];
   //1.Lee 2.Kim 3.Hong

   private static ObjectInputStream inputStream;
   private static ObjectOutputStream outputStream;

   public static void main(String[] args)
   {
      readAccount();
      saveAccount();
      closeFile();
      saveSerializedAccount();
      closeFile();
      readSerializedAccount();
      closeFile();

   }

   // read record from file
   public static void readAccount()
   {
      System.out.printf("<Read>%n%-10s%-12s%-12s%n",
         "name", "acctNum", "balance");
      try 
      {
         input=new Scanner(Paths.get("acctOne.txt"));
         for(int i=0; i<3; i++){
            account[i]=new Account();
            account[i].setName(input.next());
            //System.out.println(input.nextInt());
            account[i].setAccount(input.nextInt());
            /*
            if(account[i].getName().equals("Kim"))
               account[i].setBalance(input.nextDouble()+100.0);
            else if(account[i].getName().equals("Hong"))
               account[i].setBalance(input.nextDouble()-500.0);

            else*/
               account[i].setBalance(input.nextDouble());
            System.out.printf("%-10s%-12d%-10.2f%n", account[i].getName(),
                    account[i].getAccount(), account[i].getBalance());
         }
      } catch (IOException ioException){
         System.err.println("Error opening file.");
         System.exit(1);
      }
   }

   public static void saveAccount()
   {
      System.out.printf("%n<Write>%n%-10s%-12s%-12s%n",
              "name", "acctNum", "balance");
      Scanner input = new Scanner(System.in);
      try{
         output = new Formatter("acctTwo.txt");
         // output new record to file; assumes valid input
         for(int i=0; i<3; i++){
            output.format("%-10s%-12d%-10.2f%n", account[i].getName(),
                    account[i].getAccount(), account[i].getBalance());
            System.out.printf("%-10s%-12d%-10.2f%n", account[i].getName(),
                    account[i].getAccount(), account[i].getBalance());
         }
      } catch (NoSuchElementException e) {
         System.err.println("Invalid input. Please try again.");
         input.nextLine(); // discard input so user can try again
      } catch (IOException ioException){
         System.err.println("Error opening file.");
         System.exit(1);
      }
   }

   public static void saveSerializedAccount(){
      try{
         input = new Scanner(Paths.get("acctTwo.txt"));
         outputStream = new ObjectOutputStream(
                 Files.newOutputStream(Paths.get("acct.ser")));

         System.out.printf("%n<WriteSerialized>%n%-10s%-12s%-12s%n",
                 "name", "acctNum", "balance");
         while (input.hasNext()){
            Account record=new Account(input.next(), input.nextInt(), input.nextDouble());
            outputStream.writeObject(record);
            System.out.printf("%-10s%-12d%-10.2f%n", record.getName(),
                    record.getAccount(), record.getBalance());
            }
      } catch (IOException ioException) {
         System.err.println("Error writing to file. Terminating.");
      }
   }

   public static void readSerializedAccount()
   {
      System.out.printf("%n<ReadSerialized>%n%-10s%-12s%-12s%n",
              "name", "acctNum", "balance");
      try
      {
         inputStream=new ObjectInputStream(
                 Files.newInputStream(Paths.get("acct.ser")));
         outputStream = new ObjectOutputStream(
                 Files.newOutputStream(Paths.get("acctThird.ser")));
         while (true) // loop until there is an EOFException
         {
            Account record = (Account) inputStream.readObject();

            // display record contents
            System.out.printf("%-10s%-12d%-10.2f%n",
                    record.getName(), record.getAccount(),
                    record.getBalance());

            outputStream.writeObject(record);
         }
      }
      catch (EOFException endOfFileException)
      {
         System.out.printf("%nNo more records%n");
      }
      catch (ClassNotFoundException classNotFoundException)
      {
         System.err.println("Invalid object type. Terminating.");
      }
      catch (IOException ioException)
      {
         System.err.println("Error reading from file. Terminating.");
      }
   } // end method readRecords


   // close file and terminate application
   public static void closeFile()
   {
      if (input != null)
         input.close();
      if (output != null)
         output.close();
      try{
         if(inputStream !=null)
            inputStream.close();
         if(outputStream !=null)
            outputStream.close();
      } catch (IOException ioException){
         System.err.println("Error closing file. Terminating.");
      }
   }

} // end class AccountTest


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