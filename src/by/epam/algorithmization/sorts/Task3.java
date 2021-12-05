/*
 * 3. 
 * Сортировка выбором. Дана последовательность чисел 
 * Требуется переставить элементы так, чтобы они были расположены по убыванию. 
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, 
 * а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. 
 * Написать алгоритм сортировки выбором. 
 */
package by.epam.algorithmization.sorts;

import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("Array size = ");

        int[] myArray = new int[n];
        
        //Create array
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = i;
            System.out.print(" " + myArray[i] + " ");
        }    
        System.out.println();
                
        //Calculations
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < myArray.length; i++) {
            max = i;
            for (int j = i; j < myArray.length; j++) {
                if (myArray[j] > myArray[max]) 
                    max = j;
            } 
            tmp = myArray[i];
            myArray[i] = myArray[max];
	    myArray[max] = tmp;
        }
        
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(" " + myArray[i] + " ");
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
