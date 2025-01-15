//Unit 5 Lab 2
//Point and LineSegment
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

class LineSegmentDriver{

    public static void Run(){
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter the coordinates of point 1, first x, then y."); 
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter the coordinates of point 2, first x, then y."); 
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        LineSegment line = new LineSegment(x1, y1, x2, y2);
        System.out.println(line.toString());
        System.out.println("The slope of line 1 is " + line.getSlope() + " and its length is " + line.getLength());
        System.out.println("Intersects the x-axis? " + line.intersectsX() + "\nIntersects the y-axis? " + line.intersectsY());
    }

    public static void main(String[] args){
        LineSegmentDriver.Run();
    }
}