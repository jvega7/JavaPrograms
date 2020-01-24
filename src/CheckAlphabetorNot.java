import java.util.Scanner;


//  To check whether the entered character is an alphabet or not


public class CheckAlphabetorNot {

    CheckAlphabetorNot(){


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        //
        char ch = scan.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
