public class StringCompare
{
    public static void compare()
    {
    String w1 = "catalog";
    String w2 = "cat";
    
   if (w1.compareTo("aaa") > 0)
    {
        System.out.println("condition 1 is true");
    }
     if (w1.compareTo("aaa") == 0)
    {
        System.out.println("condition 2 is true");
    }
     if (w1.compareTo(w2) < 0)
    {
        System.out.println("condition 3 is true");
    }
    if (w1.substring(0, 3) == w2.substring(0,3))
    {
        System.out.println("condition 4 is true");
    }
}
}

