import java.util.*;
import java.io.*;

class SwitchName
{
   public static String changeFormat(String name)
   {
      String result = "";
      int space = name.indexOf(" ");
      result += name.substring(space + 1) + ", ";
      result += name.substring(0, space);
      return result;
   }

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String userName = "";
      
      System.out.print("Enter your name (First Last): ");
      userName = input.nextLine();
      
      System.out.println(changeFormat(userName));
   }
}