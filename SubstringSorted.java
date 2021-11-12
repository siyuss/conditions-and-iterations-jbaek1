import java.util.Scanner;

public class SubstringSorted
{
    public static void sub ()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word!");
        String word = s.next();
        int length = word.length();
        String cat = "";

        for (int lengthi = 1; lengthi<= length; lengthi++)
        {
            for (int indexinitial = 0; indexinitial<=length-lengthi; indexinitial ++)
            {
                System.out.println(word.substring(indexinitial, indexinitial + lengthi));
            }
            
        }
        
    }
}
