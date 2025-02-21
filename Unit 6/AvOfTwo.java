//Unit 6 Lab X
//Average of the Two Largest Elements
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

public class AvOfTwo{
    static double[] arr = new double[X0];
    static double largest = 0;
    static double second = 0;  

    public static void findTwoLargests(){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }
    }
    public static double calculateAvg(){
        return (largest + second) / 2;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please input X0 doubles");
        for(int i = 0; i < X0; i++){
            arr[i] = input.nextDouble();
        }

        System.out.print("Your numbers are: ");
        for(int i = 0; i < X0; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        
        findTwoLargests();
        System.out.print("The average of the two largest inputs are: " + calculateAvg());
    }
}