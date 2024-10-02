import java.util.*;
import java.io.*;

public class RandomInt
{
    public static int equat2 (int x, int y)
    {
        return (int) (Math.random() * (y - x + 1)) + x;
    }
    public static void main (String [] args)
    {
        String again = "n";
        while (again.equals("n"))
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter min: ");
            int min1 = input.nextInt();
            
            System.out.print("Enter max: ");
            int max1 = input.nextInt();
            
            int boom1 = equat2 (min1, max1);
            System.out.println("Your random int in your range is: " + boom1);
        }
    }
}