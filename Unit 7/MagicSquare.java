//Unit 8 Lab 1
//MagicSquare
//Alisha Wheeler - period 2

import java.util.*;
import java.io.*;

public class MagicSquare {
    
    public static boolean isMagicSquare(int[][] array) {
        int sum = 0;
        int mainSum = 0;
        int minorSum = 0;

        // Get the sum of the first row
        for (int c = 0; c < array[0].length; c++) {
            sum += array[0][c];
        }

        // Checking rows
        for (int r = 0; r < array.length; r++) {
            int rowSum = 0;
            for (int c = 0; c < array.length; c++) {
                rowSum += array[r][c];
            }
            if (rowSum != sum) {
                return false;  
            }
        }

        // Checking columns
        for (int c = 0; c < array.length; c++) {
            int colSum = 0;
            for (int r = 0; r < array.length; r++) {
                colSum += array[r][c];
            }
            if (colSum != sum) {
                return false;  
            }
        }

        // Checking the main diagonal
        for (int i = 0; i < array.length; i++) {
            mainSum += array[i][i];
        }
        if (mainSum != sum) {
            return false;  
        }

        // Checking the minor diagonal
        for (int j = 0; j < array.length; j++) {
            minorSum += array[j][array.length - j - 1];  
        }
        if (minorSum != sum) {
            return false;  
        }

        return true; 
    }

    public static int getSharedsum(int[][] array) {
        int sum = 0;
        for (int c = 0; c < array[0].length; c++) {
            sum += array[0][c];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square array (ex., 3 for 3x3): ");
        int size = scanner.nextInt();

        int[][] arr = new int[size][size];
        System.out.println("Enter the numbers of the array row by row:");
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print("Enter the number at row: " + (r + 1) + " and column " + (c + 1) + ": ");
                arr[r][c] = scanner.nextInt();
            }
        }

        if (isMagicSquare(arr)) {
            System.out.println("Your array IS a Magic Square!! :)");
            System.out.println("The shared sum is: " + getSharedsum(arr)); 
        } else {
            System.out.println("Your array is NOT a Magic Square :(");
        }

        scanner.close();
    }
}