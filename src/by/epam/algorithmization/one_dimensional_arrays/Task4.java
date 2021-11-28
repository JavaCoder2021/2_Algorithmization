/*
 * 4. 
 * Даны действительные числа а1 ,а2 ,..., аn. 
 * Поменять местами наибольший и наименьший элементы. 
 */
package by.epam.basics.algorithmization.one_dimensional_arrays;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        
        int n = scannerInt("Amount of elements = ");
        
        double[] myArray = new double[n];
        int maxN = 0;
        int minN = 0;       
        double maxA = 0;
        double minA = 0;
             
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = (double) (Math.random() * 20) - 10;
            System.out.printf(" %.1f  ", myArray[i]);
        }
        System.out.println("");
        
        //Calculations 
        for (int i = 0; i < n; i++) {
            if (i==0) {
                maxN = 0;
                minN = 0;
                maxA = myArray[0];
                minA = myArray[0];
            }
            else {
                //Max element
                if (myArray[i] > maxA) {
                    maxN = i;
                    maxA = myArray[i]; 
                }
                //Min element
                if (myArray[i] < minA) {
                    minN = i;
                    minA = myArray[i]; 
                }
            }
        }  
        
        //Swapping elements in places
        myArray[maxN] = minA;
        myArray[minN] = maxA;
        
        System.out.println("Final array:");
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
