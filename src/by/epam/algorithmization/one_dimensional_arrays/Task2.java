/*
 * 2. 
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен
 */
package by.epam.basics.algorithmization.one_dimensional_arrays;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        
        int n    = scannerInt("Amount of elements = ");
        double Z = scannerInt("Z = ");
   
        double[] myArray = new double[n];
        int summ = 0;
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = (double) (Math.random() * 9 + 1);
            System.out.printf(" %.1f  ", myArray[i]);
            //Calculations
            if (myArray[i] > Z) {
                myArray[i] = Z;
                summ++;
            }
        }
        System.out.println();
                   
        System.out.println("Amount of elements > Z = " + summ);
        for (int i = 0; i < n; i++) {
            System.out.printf(" %.1f  ", myArray[i]);            
        }
        System.out.println("");
      
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
