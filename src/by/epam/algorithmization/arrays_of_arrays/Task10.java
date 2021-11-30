/*
 * 10. 
 * Найти положительные элементы главной диагонали квадратной матрицы.   
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task10 {
    
    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("n = ");
               
        Random random = new Random();
        int[][] myArray = new int[n][n];
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++) {
            for (int a = 0; a < myArray.length; a++) {
                myArray[i][a] = random.nextInt(20) - 10;
                System.out.print(myArray[i][a] + "\t");
             }
            System.out.println();
        }
                       
        //Output
        System.out.println("Positive valuses:");
        for (int i = 0; i < myArray.length; i++)
            if (myArray[i][i] > 0) 
                System.out.printf(" %d ", myArray[i][i]);
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
