import java.util.*;
import java.io.*;

   public class SlopeForm
   {
      public static void main (String [] args)
      {
         String again = "n";
         while (again.equals("n"))
         {
            Scanner input = new Scanner(System.in);
            
            int a,b,c;
            double m,yint;
            
            System.out.print("using the equation Ax + By = C, Enter a positive integer for A: ");
            a = input.nextInt();
            
            System.out.print("Enter B: ");
            b = input.nextInt();
            
            System.out.print("Enter C: ");
            c = input.nextInt();
            
            //y=mx+b
            
            m = (double) (a)/b;
            m *= -1;
            yint = (double) (c)/b;
            System.out.println("y = " + m + "x + " + yint);
            System.out.println("Enter n to run again, x to quit");
            again = input.next();
            
         }
      }
   }
