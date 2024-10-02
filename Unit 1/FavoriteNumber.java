import java.util.*;

   public class FavoriteNumber
   {
      public static void main(String [] arg)
      {
         String again = "N";
         while (again.equals("N"))
         {
            Scanner input = new Scanner(System.in);
            double x;
      
            System.out.println("what's your favorite number?");
            x = input.nextDouble();
      
            if (x == 7)
               System.out.println("this is the best number in the whole world");
            else if (x != 7)
               System.out.println("ew, you suck");
               
               System.out.println("Enter N to run again, X to quit");
               again = input.next();
          }
      }
}