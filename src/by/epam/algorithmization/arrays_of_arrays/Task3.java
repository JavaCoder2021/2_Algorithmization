/*
 * 3. 
 * Дана матрица. 
 * Вывести k-ю строку и p-й столбец матрицы.  
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("n = ");
               
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
        
        //Input k
        int k = scannerInt("k = ");
        while (k < 1 || k > n) {
            k = scannerInt("k = ");
        }
        //Input p
        int p = scannerInt("p = ");
        while (p < 1 || p > n) {
            p = scannerInt("p = ");
        }
 
        //Output
        //String k
        System.out.println("Output String k:");
        for (int a = 0; a < n; a++) {
            System.out.print(myArray[k - 1][a] + "\t");
        }
        System.out.println();
        //Column p
        System.out.println("Output Column p:");
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n; a++) {
                if (p == a + 1)
                    System.out.print(myArray[i][a] + "\t");
                else 
                    System.out.print("\t");
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
