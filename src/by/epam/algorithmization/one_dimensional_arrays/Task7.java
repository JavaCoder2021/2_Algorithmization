/*
 * 7. 
 * Даны действительные числа a , a	2	,   , a	n	. Найти										
 * max( a + a	2n	, a	2	+ a	2n −1	,   , a	n	+ a	n +1	) .
 */
package by.epam.algorithmization.one_dimensional_arrays;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
               
        int n = scannerInt("Enter an even number of items: ");
        
        double[] myArray = new double[n];
        double max = 0.0;
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = (double) (Math.random() * 20) - 10;
            System.out.printf(" %.3f  ", myArray[i]);
        }
        System.out.println("");
        
        //Calculations
        for (int i = 0; i < n/2; i++) {
            if (i == 0 ) 
                max = myArray[i] + myArray[n - 1 - i];
            else if ((myArray[i] + myArray[n - 1 - i]) > max) 
                max = myArray[i] + myArray[n - 1 - i];
        }           
                
        System.out.printf("max = %.3f \n", max);
        
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
        } while (num % 2 != 0 || num <= 0);

        return num;
        
    }    
    
}
