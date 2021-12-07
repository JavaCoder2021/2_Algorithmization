/*
 * 14.
 * Натуральное число, в записи которого n цифр,  
 * называется числом Армстронга, если сумма его цифр, 
 * возведенная в степень n, равна самому числу.  
 * Найти все числа Армстронга от 1 до k.  
 * Для решения задачи использовать декомпозицию. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task14 {
    
    public static void main(String[] args) {

        int k = scannerInt("k = ");
        
        int[] A = armstrongNumbers(k);
        
        output(A);
        
    }
    
    //Input
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
    
    //Number of digits
    public static int numberOfDigits(int[] myArray, int number) {
        
        int count = 0;
        
        while (number > 0) {
            myArray[count++] = number % 10;
            number /= 10;
        }
        
        return count;
        
    }
    
    //Sum of digits
     public static int sumOfDigits(int[] myArray, int count) {
         
        int sumN = 0;
        
        for (int a = 0; a < count; a++) 
            sumN += Math.pow(myArray[a], count); 
         
        return sumN;
         
     }
        
    public static int[] armstrongNumbers(int k) {
        
        int count, number, sumN; 
        int[] myArray = new int[10];
        int[] A = new int[100];
        int countInArray = 0;
        
        for (int i = 1; i <= k; i++) {
            
            count = 0;
            number = i;
            number = i;
            sumN = 0;

            count = numberOfDigits(myArray, number); //Number of digits  
            
            sumN = sumOfDigits(myArray, count); //Sum of digits
            
            if (i == sumN) {
                A[countInArray] = i;
                countInArray++;
            }
                
        }
        
        return A;
        
    }
    
     //Output
    public static void output(int[] A) {
        
        for (int i =1; i < A.length; i++)
            if (A[i] > 0)
                System.out.printf(" %d ", A[i]);
        System.out.println();
        
    }
    
}
