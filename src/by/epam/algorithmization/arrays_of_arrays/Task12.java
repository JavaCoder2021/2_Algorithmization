/*
 * 12. 
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов. 
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task12 {
    
    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("n = ");
               
        Random random = new Random();
        int[][] myArray = new int[n][n];
        int tmp;
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++) {
            for (int a = 0; a < myArray.length; a++) {
                myArray[i][a] = random.nextInt(10);
                System.out.print(myArray[i][a] + "\t");
             }
            System.out.println();
        }
        
        //Calculations Ascending
        System.out.println("Array ascending:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                for (int k = j + 1; k < myArray.length; k++) {
                    if (myArray[i][j] > myArray[i][k]) {
                        tmp = myArray[i][j];
                        myArray[i][j] = myArray[i][k];
                        myArray[i][k] = tmp;
                    }
                }
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
                      
        //Calculations Desending
        System.out.println("Array descending:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                for (int k = j + 1; k < myArray.length; k++) {
                    if (myArray[i][j] < myArray[i][k]) {
                        tmp = myArray[i][j];
                        myArray[i][j] = myArray[i][k];
                        myArray[i][k] = tmp;
                    }
                }
                System.out.print(myArray[i][j] + "\t");
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
