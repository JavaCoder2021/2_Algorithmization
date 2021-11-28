/*
 *  9. 
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.
 */
package by.epam.basics.algorithmization.one_dimensional_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task9 {

    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("Elements in an array: ");
        
        Random random = new Random();
        int[] myArray = new int[n];
 
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = random.nextInt(10) - 5;
            System.out.printf(" %d  ", myArray[i]);
        }
        System.out.println("");
        
        int nCount = myArray[0];
        int nCountMax = 1;
        
        int nCountNow = 0;
        int nCountMaxNow = 0;
        
        //Calculations
        for (int i = 0; i < myArray.length; i++) {
            nCountMaxNow = 0;
            for (int a = 0; a < myArray.length; a++) {
                if (myArray[a] == myArray[i]) {
                    if (nCountMaxNow == 0) 
                        nCountNow = myArray[i];
                    nCountMaxNow++;
                }    
            }
            if (nCountMaxNow > nCountMax) {
                nCount = nCountNow;
                nCountMax = nCountMaxNow;
            }
            else if (nCountMaxNow == nCountMax && nCountNow < nCount) {
                nCount = nCountNow;
                nCountMax = nCountMaxNow;
            }
        }
        
        //Output
        System.out.println("Most common number: " + nCount);

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
