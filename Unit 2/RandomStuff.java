//Unit 2 Lab 1
//Random Stuff
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

   public class RandomStuff
   {
      //random double
      public static double equat1 (double x, double y)
      {
         return (Math.random() * (y - x)) + x;
      }
      
      //random int
      public static int equat2 (int x, int y)
      {
         return (int) (Math.random() * (y - x + 1)) + x;
      }

      //f to c
      private static int ftoc (int x)
      {
         int poop1 = (int) ((x-32) * ((double) (5)/9) + 0.9);
         return poop1;
      }
      
      //c to f
      private static int ctof (int x)
      {
         int poop2 = (int) ((((double) (9)/5) * x +32) + 0.9);
         return poop2;
      }
      
      //main
      public static void main (String [] args)
      {
         String again = "n";
         while (again.equals("n"))
         {
            //random int
            Scanner input = new Scanner(System.in);
            System.out.print("Enter min: ");
            int min1 = input.nextInt();
            
            System.out.print("Enter max: ");
            int max1 = input.nextInt();
            
            int boom1 = equat2 (min1, max1);
            System.out.println("Your random int in your range is: " + boom1);
            
            //random double
            System.out.print("Enter min: ");
            double min2 = input.nextDouble();
            
            System.out.print("Enter max: ");
            double max2 = input.nextDouble();
            
            double boom2 = equat1 (min2, max2);
            System.out.println("Your random double in your range is: " + boom2);
            
            //f to c
            System.out.print("Enter an int for fahrenheit: ");
            int fah = input.nextInt();
            
            int ans1 = ftoc (fah);
            System.out.println(fah + " in celsius is " + ans1);
            
            //c to f
            System.out.print("Enter an int for celsius: ");
            int cels = input.nextInt();
            
            int ans2 = ctof (cels);
            System.out.println(cels + " in fahrenheit is " + ans2);
            
            //end of while loop
            System.out.println("Enter n to run again, x to quit");
            again = input.next();
         }
      }
   }