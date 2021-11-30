/*
 * 15. 
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task15 {
    
    public static void main(String[] args) {
        
        //Input
        int m = scannerInt("m = ");
        int n = scannerInt("n = ");

        Random random = new Random();
        int[][] myArray = new int[m][n];

        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < m; i++) {
            for (int a = 0; a < n; a++) {
                myArray[i][a] = random.nextInt(51);
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
        
        //Calculations
        int max = 0;
        for (int i = 0; i < m; i++)
            for (int a = 0; a < n; a++)
                if (myArray[i][a] > max) max = myArray[i][a];
        
        System.out.println("max: " + max);
        
        for (int i = 0; i < m; i++)
            for (int a = 0; a < n; a++)
                if (myArray[i][a] % 2 == 1) myArray[i][a] = max;

        //Output
       System.out.println("Output array:");
        for (int i = 0; i < m; i++) {
            for (int a = 0; a < n; a++) {
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
        
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
