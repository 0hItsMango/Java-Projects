// Rock Driver
// 
// Original Author: d.oberle
// Modified by Alisha Wheeler

public class RockDriver
{
     public static void main(String[]arg)
     {
          Rock karel = new Rock();
          Rock pete = new Rock("brown", 3.2, 5);

          System.out.println(karel);
          System.out.println(pete);
          System.out.println();

          //paint karel orange and break pete in half
          karel.setColor("orange");
          pete.breakInTwo();
          System.out.println();

          System.out.println(karel);
          System.out.println(pete);
     }
}


