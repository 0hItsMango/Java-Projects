//Unit 5 Lab 2
//Point and LineSegment
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

class LineSegment{
    Point startPoint;
    Point endPoint;
    double x1, x2, y1, y2;
    
    public LineSegment(double px1, double py1, double px2, double py2){
        startPoint = new Point(px1,py1);
        endPoint = new Point(px2,py2);
        x1 = px1;
        x2 = px2;
        y1 = py1;
        y2 = py2;
    }

    public double getLength(){
        return Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
    }
    public double getSlope(){
        return (y2-y1)/(x2-x1);
    }
    public boolean intersectsX(){
        return ((y1>=0)&&(y2<=0))||((y2>=0)&&(y1<=0));
    }
    public boolean intersectsY(){
        return ((x1>=0)&&(x2<=0))||((x2>=0)&&(x1<=0));
    }
    public String toString(){
        return "Endpoint 1: " + startPoint.toString() + " Endpoint 2: " + endPoint.toString();
    }
}