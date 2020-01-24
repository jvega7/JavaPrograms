//Find the max and min between two numbers.

import java.util.Scanner;

public class MaxNDMin {

    MaxNDMin(){

        System.out.println("Enter a random number");
        Scanner numberA = new Scanner(System.in);
        double a = numberA.nextDouble();

        System.out.println("Enter a random number");
        Scanner numberB = new Scanner(System.in);
        double b = numberB.nextDouble();

        if(a == b){

            System.out.println("The numbers are equal, retry");
            System.exit(0);
        }
        if(a > b && a != b){

            System.out.println("The max number is: " + a);
            System.out.println("The min number is: " + b);

        }else{

            System.out.println("The max number is: " + b);
            System.out.println("The min number is: " + a);
        }

    }
}
