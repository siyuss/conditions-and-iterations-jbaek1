import java.util.Scanner;


/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author jbaek
 * @version 16nov2020
 */
public class Iterations
{
    public static void whileExample()
    {
        /* 
         * while loop:
         * evaluates a boolean expression
         * if true, executes the body of the loop and then re-evaluates the condition
         * if false, skips the body and continues
         * 
         */
        int count =1; // initialization
        while (count <=5)//condition
        {
            System.out.println(count); // body
            count++; //update the looping variable
            
        }
        System.out.println("Done.");
        // careful for infinite loops; often a result of not properly updating the loop variable or 
        // writing an impossible loop condition.
        
    }
    public static void forExample()
    {
        /*
         * for loop:
         * Three parts of the for loop statement
         * 1. initialization - executed once
         * 2. looping condition - boolean expression evaluated at the start of each iteration
         * 3. update the loop variable - executed at the *end* of each iteation *before* evaluating the condition again
         * 
         */
        for (int count = 1; // initialization
        count <=5; // condition
        count ++)
        {
            System.out.println(count); // body
            
        }
            System.out.println("done");
            /*
             * variables declared within the for statement are scoped to the for statement and its body
             * 
             */
        }
        public static void offByOne()
        {
            /*
             * the infamous off-by-one error is common with for loops
             * executing one too many or one too few times
             * should initial value start at 0 or 1?
             * should the condition < or <=?
             * 
             */
            for (int i = 0;
            i<=5;
            i++)
            {
                System.out.println("*");
                
            }
        }
    }

