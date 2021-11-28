/*
 * 2. Дана квадратная матрица. 
 * Вывести на экран элементы, стоящие на диагонали.
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("Elements in an array: ");
        
        Random random = new Random();
        int[][] myArray = new int[n][n];
 
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++) {
            for (int a = 0; a < myArray.length; a++) {
                myArray[i][a] = random.nextInt(20);
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }    

        //Output
        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n; a++) {
                if (i == a || a == n - 1 - i)
                    System.out.print(myArray[i][a] + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        //Output
        System.out.println("Output main diagonal:");
        for (int i = 0; i < n; i++)
            System.out.print(myArray[i][i] + "\t");
        System.out.println();
        //Output
        System.out.println("Output side diagonal:");
        for (int i = 0; i < n; i++)
            System.out.print(myArray[i][n - i - 1] + "\t");
        System.out.println();
    }
    
    private static int scannerInt(String str) {
        
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        do {
            System.out.print(str);
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num <= 0);

        return num;
        
    }    
    
}
