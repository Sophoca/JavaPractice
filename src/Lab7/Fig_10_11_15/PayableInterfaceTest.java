package Lab7.Fig_10_11_15;

// Fig. 10.15: PayableInterfaceTest.java
// Payable interface test program processing Invoices and
// Employees polymorphically.
public class PayableInterfaceTest 
{
   public static void main(String[] args)
   {
      // create four-element Payable array
      Payable[] payableObjects = new Payable[7];
      
      // populate array with objects that implement Payable
      payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
      payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
      payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
      payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
      payableObjects[4] = new CommissionEmployee("aFirst", "aLast", "111-11-1111", 800.00, 0.9);
      payableObjects[5] = new HourlyEmployee("bFirst", "bLast", "222-22-2222", 16.75, 40);
      payableObjects[6] = new BasePlusCommissionEmployee("cFirst", "cLast", "444-44-4444", 5000, .04, 300);

      System.out.println("Invoices and Employees processed polymorphically:");
      for (Payable currentPayable : payableObjects){
         System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
      }
   } // end main
} // end class PayableInterfaceTest


/**************************************************************************
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
