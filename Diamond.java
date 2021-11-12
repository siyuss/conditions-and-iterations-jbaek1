import java.util.Scanner;

public class Diamond
{
    public static void bigHenry()
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Type an integer to be the diamond's side length!");
        int length = s.nextInt();
        for (int i=0; i<length; i++)
        {
            for (int j=1; j<=length - 1 - i; j++)
            {
                System.out.print(" ");
            }
            for (int k =1; k<=2*i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
