// written by 201720813
package Lab3;
import java.util.Scanner;

public class Purchasing {
    static int[] unit={10, 20, 30, 40, 50, 60, 70, 80, 90 ,100};
    static int[] stock={5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    static int[] purchase=new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int menu;
        while(true){
            System.out.flush();
            System.out.println("\nMenu\n1.viewUnitPrice\n2.addPurchasingProduct\n3.calculateTotalPrice");
            menu=input.nextInt();
            if(menu==1){
                viewUnitPrice();
            }
            else if(menu==2){
                addPurchasingProduct();
            }
            else if(menu==3){
                totalPrice();
                break;
            }
            else{
                System.out.println("Please input correct number.\n");
            }
        }
    }

    public static void viewUnitPrice(){
        for(int i=0; i<10; i++){
            System.out.printf("\nUnit identification : %d\nUnit price : %d\n", i+1, unit[i]);
        }
    }

    public static void addPurchasingProduct(){
        Scanner input=new Scanner(System.in);
        System.out.print("\nEnter the unit identification and quantity : ");
        int index=input.nextInt()-1;
        int quantity=input.nextInt();
        if(stock[index]<quantity) System.out.println("The product is out of stock!");
        else{
            stock[index]-=quantity;
            purchase[index]+=quantity;
        }
        for(int i=0; i<10; i++){
            if(purchase[i]!=0) System.out.printf("%d item from product type %d.\n", purchase[i], i+1);
        }
        System.out.println();
    }

    public static void totalPrice(){
        int sum=0;

        for(int i=0; i<10; i++){
            if(purchase[i]!=0) sum+=purchase[i]*unit[i];
        }
        System.out.println("\nThe total price is "+sum);
    }
}
