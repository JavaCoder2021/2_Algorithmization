/*
 * 1. 
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив  второй  массив  между  k-м  и  (k+1)  -  м  элементами  первого,  
 * при  этом  не  используя дополнительный массив. 
 */
package by.epam.algorithmization.sorts;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        
        //Input
        int size1 = scannerInt("First array size = ");
        int size2 = scannerInt("Second array size = ");
        
        Scanner input = new Scanner(System.in);
        int k = -1;
        do {
            System.out.print("k = ");
            if (input.hasNextInt()) {
                k = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (k <= 0 || k > size1 - 1);       

        int[] myArray1 = new int[size1];
        int[] myArray2 = new int[size2];
        int[] myArray3 = new int[size1 + size2];
        
        //Create array 1
        System.out.println("Array 1:");
        for (int i = 0; i < size1; i++) {
            myArray1[i] = 1;
            System.out.print(" " + myArray1[i] + " ");
        }    
        System.out.println();
        
        //Create array 2
        System.out.println("Array 2:");
        for (int i = 0; i < size2; i++) {
            myArray2[i] = 2;
            System.out.print(" " + myArray2[i] + " ");
        }  
        System.out.println();
        
        //Calculations
        int tmp = 0;
        for (int i = 0; i < myArray3.length; i++)
            if (i >= k && tmp < myArray2.length) {
                myArray3[i] = myArray2[tmp];
                tmp++;
            }
            else {
                myArray3[i] = myArray1[i - tmp];
            }       
        
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray3.length; i++)
            System.out.print(" " + myArray3[i] + " ");
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
