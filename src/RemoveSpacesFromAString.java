//Remove Spaces from a String
//
//Given a string as input, output it without spaces.
//
//For example:
//string = "ab c  d e fgh i  j kl mn  opqr  stuvwxyz"
//result = "abcdefghijklmnopqrstuvwxyz"

import java.util.Scanner;

public class RemoveSpacesFromAString {

    RemoveSpacesFromAString(){
        String results = userInput().replace(" ", "");
        System.out.println(results);

    }
    //Method for user input
    String userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter phrase with spaces : ");
        //String to hold password to test
        return scan.nextLine();
    }
}

