/*
 * 5. 
 * Составить программу, которая в массиве A[N] находит второе по величине число  
 * (вывести на печать число, которое меньше максимального элемента массива, 
 * но больше всех других элементов). 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;
import java.util.Random;

public class Task5 {
    
    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("n = ");
        
        Random random = new Random();
        double[] A = new double[n];
        
        //Create array
        System.out.println("Array");
        for (int i = 0; i < n; i++) {
            A[i] = -10.0 + random.nextDouble() * 20;
            System.out.printf(" %.2f ", A[i]);
        }
        System.out.println();
        
        double max2;
        max2 = foundMax2(A, n);

        //Output
        System.out.printf("max2: %.2f \n", max2);

    }
    
    public static double foundMax2(double[] A, int n) {   
        
        double max = A[0];
        double max2 = A[1];
        double tmp = 0;
        if (max2 > max) {
            max = tmp;
            max = max2;
            max2 = tmp;
        }
                
        //Found max
        for (int i = 0; i < n; i++)
            if (A[i] > max) 
                max = A[i];
        
        //Found max2
        for (int i = 0; i < n; i++)
            if (A[i] > max2 && A[i] < max)
                max2 = A[i];
        
        return max2;
        
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
