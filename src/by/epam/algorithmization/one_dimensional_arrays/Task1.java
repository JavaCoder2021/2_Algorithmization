/*
 * 1. 
 * В массив A[N] занесены натуральные числа. 
 * Найти сумму тех элементов, которые кратны данному К. 
 */
package by.epam.algorithmization.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        
        int n = scannerInt("Amount of elements = ");
        int K = scannerInt("K = ");
        
        Random random = new Random();
        int[] myArray = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++)
            myArray[i] = random.nextInt(10) + 1;
        
        for (int i = 0; i < n; i++)
            if (myArray[i] % K == 0)               
                sum += myArray[i];
            
        System.out.println(Arrays.toString(myArray));
        System.out.println("Sum of elements multiples of K = " + sum);
      
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
