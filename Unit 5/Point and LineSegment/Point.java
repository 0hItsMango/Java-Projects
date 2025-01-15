//Unit 5 Lab 2
//Point and LineSegment
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

class Point{
    double xPoint;
    double yPoint;

    public Point(double x, double y){
        xPoint = x;
        yPoint = y;
    }

    public double getX(){
        return xPoint;
    }
    public double getY(){
        return yPoint;
    }
    public String toString(){
        return "(" + String.valueOf(xPoint) + ", " + String.valueOf(yPoint) + ")";
    }
}