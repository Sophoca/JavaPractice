package temp;

import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        Test test[]=new Test[3];
        test[0]=new Test(0.0, 0.0);
        test[1]=new Test(1, 1);
        test[2]=new Test(2, 2);
        for(Test temp:test)
            System.out.printf("%.1f, %.1f\n", temp.getX(), temp.getY());

        System.out.println("");
        test[2]=new Test(5, 5);
        for(Test temp:test)
            System.out.printf("%.1f, %.1f\n", temp.getX(), temp.getY());

        System.out.println("");
        test[1]=new Test(8, 8);
        for(Test temp:test)
            System.out.printf("%.1f, %.1f\n", temp.getX(), temp.getY());

    }

}
