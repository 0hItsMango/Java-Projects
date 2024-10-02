import java.util.*;
import java.io.*;

public class CelsiusToFahrenheit
{
    private static int ctof (int cInput)
    {
        int fOutput = (int) ((((double) (9)/5) * cInput +32) + 0.9);
        return fOutput;
    }

    public static void main (String [] args)
    {
        String again = "n";
        while (again.equals("n"))
        {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter an int for celsius: ");
            int cels = input.nextInt();
            
            int ans = ctof (cels);
            System.out.println(cels + " in fahrenheit is " + ans);

            System.out.println("Enter n to run again, x to quit");
            again = input.next();
        }
    }
}