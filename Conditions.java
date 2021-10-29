import java.util.Scanner;

/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @author jbaek
 * @version 16nov2020
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip; 1 heads, 0: tails
        int coinFlip = (int) (Math.random() * 2);
        /*
         * if statement
         * Statements are executed if the conditional expression is true.
         * Conditional expressions evaluate to either true or false; must go inside parentheses
         * statements are grouped by blocks (i.e. {}), not by indentation
         */ 
         if (coinFlip == 1) {
         System.out.println("Coin is heads!");   
         }
         /*
          * if-else statement
          * The else block is executed if the condition evaluates to false.
          */
          if (coinFlip == 1) {
         System.out.println("Coin is heads!"); 
        }
        else{
          System.out.println("Coin is tails!");
          System.out.println("Better luck next time!");
        }
        // model the roll of a four-sided die [1-4]
        int dieRoll = (int) (Math.random() * 4) + 1;
        /*
         * if-else if-else statement
         * In java, "else if" is used instead of "elif" like Python
         */
        if (dieRoll == 1)
        {
            System.out.println("rolled a one");
        }
        else if (dieRoll == 2) 
        {
            System.out.println("rolled a 2");
        }
        else if (dieRoll == 3) // can have as many as needed
        {
            System.out.println("rolled a 3");
        }
        else if (dieRoll == 4) 
        {
            System.out.println("rolled a 4");
        }
    }
    }
