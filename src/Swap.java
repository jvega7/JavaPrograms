//Swapping between two numbers using any technique you know.


import java.util.Scanner;

public class Swap {
    //object
    Swap() {
        //Scanner to store the user first number
        System.out.println("Enter a random number");
        Scanner numberA = new Scanner(System.in);
        double a = numberA.nextDouble();
        //Scanner to store the user second number
        System.out.println("Enter a random number");
        Scanner numberB = new Scanner(System.in);
        double b = numberB.nextDouble();

        System.out.println("The number store in A is : "  + a);
        System.out.println("The number store in B is : "  + b);

        double tempa = a;
        double tempb = b;
        a = tempb;
        b = tempa;

        System.out.println("The number stored in A is now: "  + a);
        System.out.println("The number stored in B is now: "  + b);
    }


}
