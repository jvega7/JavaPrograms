import java.util.Scanner;

public class FindetotheNthDigit {

    FindetotheNthDigit() {

        int place;
        double pi;
        String spi;
        boolean done = false;


        do {
            //Take  in input from user to know decimal place
            System.out.println("Enter a number of decimal places 1 to 10 for PI");
            Scanner input = new Scanner(System.in);
            place = input.nextInt();
            if (place >= 1 && place <= 10) {
                pi = Math.PI;
                spi = Double.toString(pi);

                System.out.println(Math.PI);
                System.out.println("PI in the " + place + "position is: " + spi.charAt(place + 1));
                done = true;
            } else {
                //JOptionPane.showMessageDialog(null, "Eggs are not supposed to be green.");
                System.out.println("Input out of bounds retry");
                System.out.println("");
            }
        }
        while (!done);
    }
}
