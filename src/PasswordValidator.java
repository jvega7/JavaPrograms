//Password Validator
//
//Password validator is a program that validates passwords to match specific rules. For example, the minimum length
// of the password must be eight characters long and it should have at least one uppercase letter in it.
//
//A valid password is the one that conforms to the following rules:
// -! Minimum length is 5; use length method
// -! Maximum length is 10; use legth method
// -! Should contain at least one number; use contain
// -! Should contain at least one special character (such as &, +, @, $, #, %, etc.);
// -! Should not contain spaces.
//
//Examples:
//Input: "Sololearn"
//Output: false
//
//Input: "John Doe"
//Output: false
//
//Input: "$ololearn7"
//Output: true
//
//Write a program to checks if the user input is a valid password or not.

import java.util.Scanner;

public class PasswordValidator {

    private String password;

    PasswordValidator() {
        //Calls method UserPassword
        userPassword();
        //Minimum length is 5; use length method-! Maximum length is 10; use legth method
        if (getPassword().length() < 5 || getPassword().length() > 10) {
            System.out.println("Password Invalid: Min/Max");
            System.out.println(getPassword().length());
            System.out.println(getPassword());
            //userPassword();
            System.out.println("False");
        } else if (!getPassword().matches(".*\\d.*")) {
            System.out.println("Password Invalid: Does not contain a number");
            //userPassword();
            System.out.println("False");
        } else if(getPassword().matches(".*\\s.*")) {
            System.out.println("Password Invalid: Contain a white space");
            //userPassword();
            System.out.println("False");
        } else if(!getPassword().matches(".*\\W.*")){
            System.out.println("Password Invalid: Does not contain a special character");
            //userPassword();
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
    //Getter
    public String getPassword(){
        return password;
    }
    //Setter
    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    void userPassword(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Password to Validate : ");
        //String to hold password to test
        setPassword(scan.nextLine());
    }


}
