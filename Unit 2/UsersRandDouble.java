import java.util.*;
import java.io.*;

   public class UsersRandDouble
   {
      public static double equat (double x, double y)
      {
         return (Math.random() * (y - x)) + x;
      }
      
      public static void main (String [] args)
      {
         String again = "n";
         while (again.equals("n"))
         {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter min: ");
            double min = input.nextDouble();
            
            System.out.print("Enter max: ");
            double max = input.nextDouble();
            
            double boom = equat (min, max);
            System.out.println("Your random number in your range is: " + boom);
            
            System.out.println("Enter n to run again, x to quit");
            again = input.next();
         }
      }
   }