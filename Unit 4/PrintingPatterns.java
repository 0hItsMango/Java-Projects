//Unit 4 Lab 2
//Printing Patterns
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

class PrintingPatterns{
    public static void Box(int x){
        System.out.println();
        for (int i = 0; i < x; i++){
            for (int j = 0; j < 6; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftAligned(int x){
        System.out.println();
        for (int i = 0; i < x; i++){
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightAligned(int x){
        System.out.println();
        for (int i = 0; i < x; i++){
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for (int j = x - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void centered(int x){
        System.out.println();
        for (int i = 0; i < x; i++){
            for (int k = (x - 1) - i; k > 0; k--){
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void boxWithX(int x){
        System.out.println();
        for (int i=0; i < x; i++){
            for (int j = 0; j <x; j++){
                if (i==0 || i== x - 1 || j== 0 || j == x - 1) {
                    System.out.print("*");
                }
                 else if (i == j || i + j == x -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of x:");
        int one = input.nextInt();
        Box(one);

        System.out.println("Please enter number of x:");
        int two = input.nextInt();
        leftAligned(two);

        System.out.println("Please enter number of x:");
        int three = input.nextInt();
        rightAligned(three);

        System.out.println("Please enter number of x:");
        int four = input.nextInt();
        centered(four);

        System.out.println("Please enter number of x:");
        int five = input.nextInt();
        boxWithX(five);
    }
}