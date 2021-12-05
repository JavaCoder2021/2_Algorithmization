/*
 * 7.
 * Пусть даны две неубывающие последовательности действительных чисел. 
 * Требуется указать те места, на которые нужно вставлять элементы последовательности в первую 
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
package by.epam.algorithmization.sorts;

import java.util.Scanner;

public class Task7 {
    
    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("First array size = ");
        int m = scannerInt("Second array size = ");
        
        int[] myArray1 = new int[n];
        int[] myArray2 = new int[m];
        int[] myArray3 = new int[n + m];
        
        //Create array 1
        System.out.println("Array a:");
        for (int i = 0; i < n; i++) {
            myArray1[i] = i;
            System.out.print(" " + myArray1[i] + " ");
        }    
        System.out.println();
        
        //Create array 2
        System.out.println("Array b:");
        for (int i = 0; i < m; i++) {
            myArray2[i] = i+1;
            System.out.print(" " + myArray2[i] + " ");
        }  
        System.out.println();
        
        //Calculations
        System.out.println("Positions:");
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < myArray3.length; i++) {
            if (tmp2 >= myArray2.length || (tmp1 < myArray1.length && myArray1[tmp1] < myArray2[tmp2])) {
                myArray3[i] = myArray1[tmp1];
                tmp1++;
            } 
            else {
                myArray3[i] = myArray2[tmp2];
                tmp2++;
                System.out.print(" " + i + " ");
            }
        }
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
