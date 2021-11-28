/*
 * 5. 
 * Даны целые числа а1 ,а2 ,..., аn . 
 * Вывести на печать только те числа, для которых аi > i.
 */
package by.epam.basics.algorithmization.one_dimensional_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        
        int n = scannerInt("Amount of elements = ");
        Random random = new Random();
        int[] myArray = new int[n];
        
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = random.nextInt(10);
            System.out.printf(" %d  ", myArray[i]);
        }
        System.out.println("");
        
        System.out.println("Elements > i");
        for (int i = 0; i < n; i++) {
            if (myArray[i] > i) 
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
