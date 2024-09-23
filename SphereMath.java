import java.util.*;
import java.io.*;

   public class SphereMath
   {
      public static void main (String [] args)
      {
         String again = "n";
         while (again.equals("n"))
         {
            Scanner input = new Scanner(System.in);
            double r;
            double d;
            double c;
            double sa;
            double v;
            
            System.out.println("Enter your radius");
            r = input.nextDouble();
            
            d = 2*r;
            System.out.println("Diameter = " + d);
            
            c = 2*Math.PI*r;
            System.out.println("Circumference = " + c);
            
            sa = 4*Math.PI*Math.pow(r,2);
            System.out.println("Surface Area = " + sa);
            
            v = (4.0/3.0)*Math.PI*Math.pow(r,3);
            System.out.println("Volume = " + v);
            
            System.out.println("Enter n to run again, x to quit");
            again = input.next();
         }
      }
   }