import java.util.*;
import java.io.*;

class HalfOf{

   public static String firstHalf(String str) {
   
      str = str.substring(0, str.length()/2);
      return str;
   }
   
   public static String secondHalf(String str) {
   
      str = str.substring(str.length()/2);
      return str;
   }

   public static void main(String[] args){
    
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a phrase: ");
      
      String intake = input.nextLine();
      String first = firstHalf(intake);
      
      System.out.println("the first half of your phrase is " + first);
      
      System.out.println("Would you like the second half of your string? (yes/no)");
      String hmm = input.nextLine();
      if (hmm .equalsIgnoreCase("yes")){
         String second = secondHalf(intake);
         System.out.println(second);
      }
    }
}