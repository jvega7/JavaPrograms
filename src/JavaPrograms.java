import java.util.Scanner;

/**
 * Created by jarro on 10/24/2017.
 */
public class JavaPrograms {
    public static void main(String[] args) {
        //Programs List
        System.out.println("Programs");
        System.out.println("     0: FindPItoNthDigit"); //FindPItoNthDigit
        System.out.println("     1: Find e to the Nth Digit");//FindetotheNthDigit
        System.out.println("     2: Display a list of numbers (1 to 50) each in new line.");//OnetoFifty
        System.out.println("     3: Find the max and min between two numbers.");//MaxNDMin
        System.out.println("     4: Swapping between two numbers using any technique you know.");//Swap
        System.out.println("     5: To check whether the entered character is an alphabet or not.");//CheckAlphabetorNot
        System.out.println("     6: Password Validator.");//
        System.out.println("     7: Remove Spaces From the String");
        System.out.println("     8: The Collatz conjecture Enter a number");
        System.out.println("     9: A Gapful number Enter a number");
        System.out.println("     10: Paranoia find inconsistencies in the money transfers");
        System.out.println("     11: SummationsCalculator: input a lower bound, an upper bound and the expression");


        //Scanner for input command prompt
        System.out.println("Enter the number for the program you want: ");
        Scanner userInputProgram = new Scanner(System.in);
        int program = userInputProgram.nextInt();

        //switch to run programms
        switch (program){
            case 0: FindPItotheNthDigit myInstance = new FindPItotheNthDigit();
            break;
            case 1: FindetotheNthDigit myInstance1 = new FindetotheNthDigit();
            break;
            case 2:  OnetoFifty myInstance2 = new OnetoFifty();
            break;
            case 3: MaxNDMin myInstnce3 = new MaxNDMin();
            break;
            case 4: Swap myInstance4 = new Swap();
            break;
            case 5: CheckAlphabetorNot myInstance5 = new CheckAlphabetorNot();
            break;
            case 6: PasswordValidator myInstance6 = new PasswordValidator();
            break;
            case 7: RemoveSpacesFromAString myInstance7 = new RemoveSpacesFromAString();
            break;
            case 8: CollatzConjecture myInstance8 = new CollatzConjecture();
            break;
            case 9: GapfulNumbers myInstance9 = new GapfulNumbers();
            break;
            case 10: Paranoia myInstance10 = new Paranoia();
            break;
            case 11: SummationsCalculator myInstance11 = new SummationsCalculator();
            break;
        }
    }
}
