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
        public static void doExample(){
            /*
             * do-loop (do-while loop)
             * executes body of the loop
             * evaluates the condition:
             *  if true, executres the body of the loop again
             *  if false, continues execution after the loop
             */
            int count = 1; // initialization
            do
            {
                System.out.println(count); // body
                count++;
                 // update the loop variable
                 
                
            }
            while (count<=5);
            System.out.println("done.");
            
        }
    public static int sum(){
        Scanner s = new Scanner(System.in);
        
        int sum = 0;
        int value;
        do {
            System.out.print("Enter an integer that is positive (-1 to quit)");
            /*
             * Sentinel value
             * value (e.g. -1) used to terminate a loop, it is often entered by a user
             * 
             */
     
            
            value = s.nextInt();
            sum += value;
            // this is a bug! sum is 1 less than it should be 
        }
        while (value != -1);
        
        return sum;
        
    }
    public static int sum2(){
        Scanner s= new Scanner(System.in);
        int sum = 0;
        int value = 0;
        do 
        {
            System.out.print("enter a positive integer (-1 to quit):");
            /*
             * the has nextint mehtod of the scanner class returns true if the next token 
             * to be read is an integer; otherwise, it reutrns false. it does not consume 
             * the next token. if there are no tokens in the stream, it waits until there are
             * 
             */
            if (s.hasNextInt() == false)
            {
                System.out.println("\"" + s.next() + "\" is not an integer; try again.");
                /*
                 * continue 
                 *  1. immediately skips to the end of the inner-most loop
                 *  2. re-evaluates the loop condition at that point and contiues if the condition is true
                 *  
                 */
                continue;
                
            }
            value = s.nextInt();
            if (value == -1){
                break;
                
            }
            sum += value;
            
        }
        while (value != -1);
        return sum;
        
    }
    }
    

