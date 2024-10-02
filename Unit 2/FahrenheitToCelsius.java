import java.util.*;
import java.io.*;

public class FahrenheitToCelsius
{
    private static int ftoc (int fInput)
    {
       int cOutput = (int) ((fInput - 32) * ((double) (5) / 9) + 0.9);
       return cOutput;
    }

    public static void main (String [] args)
    {
        String again = "n";
        while (again.equals("n"))
        {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter an int for fahrenheit: ");
            int fah = input.nextInt();
            
            int ans = ftoc (fah);
            System.out.println(fah + " in celsius is " + ans);

            System.out.println("Enter n to run again, x to quit");
            again = input.next();
        }
    }
}