//Unit 6 Lab 2
//Reverse an Array
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

class Main{
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr){
        for(int i = arr.length-1; i >(arr.length/2)-1; i--){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
        
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how long you want your array to be");
        int leng = input.nextInt();
        int[] arr = new int[leng];

        System.out.println("Enter " + leng + " values");
        for(int i = 0; i < leng; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Your array is: ");
        printArr(arr);
        System.out.println("\n");

        System.out.print("Your array reversed is: ");
        reverse(arr);
        printArr(arr);
    }
}