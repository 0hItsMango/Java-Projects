//Unit 3 Lab 1
//Quadratic formula
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

class QuadForm{

    public static void equation(double a, double b, double c){
        System.out.println("Your equation is: \n" + a + "x^2 + " + b + "x + " + c + " = 0");
        String roots = "Your roots are:";
        String is = "Your string is:";

        double d = Math.pow(b, 2) - (4 * (a * c));

        if (d > 0){
            System.out.println(roots);
            System.out.println("x = " + (((-1 * b) + Math.sqrt(d)) / (2 * a)));
            System.out.println("x = " + (((-1 * b) - Math.sqrt(d)) / (2 * a)));
        }
        else if (d < 0){
            System.out.println(roots);
            System.out.println("x = " + (((-1 * b) / (2 * a)) + " + " + (Math.sqrt(d * -1)) / (2 * a)) + "i");
            System.out.println("x = " + (((-1 * b) / (2 * a)) + " - " + (Math.sqrt(d * -1)) / (2 * a)) + "i");
        }
        else if (d == 0){
            System.out.println(is);
            System.out.println((-1 * b) / (2 * a));
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter a value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter a value for c: ");
        double c = input.nextDouble();

        equation(a, b, c);
    }
}