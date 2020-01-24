//A gapful number is a number of at least 3 digits that is divisible by the number formed by the first and last
// digit of the original number.
//
//For Example:
//Input: 192
//Output: true (192 is gapful because it is divisible 12)
//
//Input: 583
//Output: true (583 is gapful because it is divisible by 53)
//
//Input: 210
//Output: false (210 is not gapful because it is not divisible by 20)
//
//Write a program to check if the user input is a gapful number or not.
public class GapfulNumbers {

    //new ClassA().yourMethod();
    //Class1.method1();
    GapfulNumbers(){
        //
        int num = CollatzConjecture.userInputNumber();
        int divisibleNum = (firstDigit(num) * 10) + lastDigit(num);
        //if div true if not false
        if(num%divisibleNum == 0 ){System.out.println("Output; true");}
        if(num%divisibleNum != 0 ){System.out.println("Output; false");}
    }
    int firstDigit(int n)
    {
        // Remove last digit from number
        // till only one digit is left
        while (n >= 10)
            n /= 10;
        // return the first digit
        return n;
    }
    int lastDigit(int n)
    {
        // return the last digit
        return (n % 10);
    }

}