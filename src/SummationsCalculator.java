//Summations Calculator
//
//Create a program that takes 3 inputs, a lower bound, an upper bound and the expression. Calculate the sum of that
// range based on the given expression and output the result.
//
//For Example:
//Input: 2 4 *2
//Output: 18 (2*2 + 3*2 + 4*2)
//
//Input: 1 5 %2
//Output: 3 (1%2 + 2%2 + 3%2 + 4%2 + 5%2)

import java.util.Scanner;

public class SummationsCalculator {

    SummationsCalculator(){
        int lowerbound;
        int upperbound;
        String expression;
        String operant;
        int interation;
        int total = 0;
        String output = " " + "( ";
        //Scanner store input from user in userInput

        System.out.println("Lower bound,upper bound and expression: ");
        Scanner userInput = new Scanner(System.in);
        //takes the first number and stores in the lowerbound
        lowerbound = userInput.nextInt();
        //takes the second number and stores in the ipper bound
        upperbound = userInput.nextInt();
        //takes the user expression and operate stores it in the variable expression
        expression = userInput.next();
        //substring method to get the operate
        operant = expression.substring(0,1);
        //staes the second part of the expression and store it in the interation. using substring,pareseInt for conversion
        interation = Integer.parseInt(expression.substring(1,2));

        //for loop to cycle the summations
        for (int i = lowerbound; i <= upperbound; i++) {
            //swtich statement to choose with operate to use, based on the operate from user input
            switch (operant){
                case "*":  total += (lowerbound * interation);
                //takes lowerbound and store it for the output
                    output += lowerbound + "*";
                    lowerbound++;
                    break;
                case "/": total += (lowerbound / interation);
                    output += lowerbound + "/";
                    lowerbound++;
                    break;
                case "+": total += (lowerbound + interation);
                    output += lowerbound + "+";
                    lowerbound++;
                    break;
                case "-": total += (lowerbound - interation);
                    output += lowerbound + "-";
                    lowerbound++;
                    break;
                case "%": total += (lowerbound % interation);
                    output += lowerbound + "%";
                    lowerbound++;
                    break;
            }
            //adds iternation number plus the add symbol to the output
            output += interation;
            //leaves off the last + symbol for the output of summations
            if (i != upperbound) output += " + ";

        }
        //Adds the last parts out the out and also the total
        output += ")";
        System.out.print(total+" ");
        System.out.print(output);

    }


}