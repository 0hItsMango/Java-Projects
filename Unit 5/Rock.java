// Rock Class
// 
// Original Author: d.oberle
// Modified by Alisha Wheeler

import java.io.*;
import java.util.*;

public class Rock
{
     private String color;      //data fields
     private double weight;
     private int length;

     public Rock()             //no-arg constructor
     {
          color = "grey";
          weight = 2.5;
          length = 7;
     }

     public Rock(String c, double w, int p)
     {                        //2-arg constructor
          color = c;
          weight = w;
          length = p;
     }

     public String getColor()  //accessor methods
     {
          return color;
     }

     public double getWeight()
     {
          return weight;
     }
     
     public double getLength()
     {
          return length;
     }


     public void setColor(String c) //mutator methods
     {                          
          color = c;
     }

     public void setWeight(double w)
     {
          weight = w;
     }
      public void setLength(int p)
     {
          length = p;
     }


     public void breakInTwo() // another mutator method
     {
      weight /= 2;
      System.out.println("CRACK!");
     }
     
     public String toString() // toString method
     {
          return "Color:" + color + " Weight:" + weight + " lbs. Length: " + length + " inches";
     }
}
