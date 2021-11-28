/*
 * 8.  
 * Дана последовательность целых чисел.  
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны min.
 */
package by.epam.basics.algorithmization.one_dimensional_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("Elements in an array: ");
        
        Random random = new Random();
        int[] myArray = new int[n];
        int min = 0;
 
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10);
            System.out.printf(" %d  ", myArray[i]);
            //Calculations
            if (i == 0 ) 
                min = myArray[i];
            else if (myArray[i] < min)
                min = myArray[i];
        }
        System.out.println("\n min = " + min);
        
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != min)
                System.out.printf(" %d  ", myArray[i]);
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
