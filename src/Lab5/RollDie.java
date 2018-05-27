package Lab5;    // Fig 7.7

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        int[] frequency=new int[7];

        for(int roll=1; roll<=6000000; roll++){
            ++frequency[1+randomNumber.nextInt(6)];
        }

        System.out.println("Face\tFrequency");
        for(int face=1; face<frequency.length; face++)
            System.out.printf("%3d.%10d%n", face, frequency[face]);
    }
}
