/*
 * 8.
 * Задан массив D. Определить следующие суммы: 
 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы) для вычисления суммы  трех 
 * последовательно расположенных  элементов массива с номерами от k до m. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;
import java.util.Random;

public class Task8 {
    
    public static void main(String[] args) {

        //Input       
        int n = scannerInt("Amount of elements = ");

        Random random = new Random();        
        int[] D = new int[n];
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
                D[i] = random.nextInt(10);
                System.out.print("  " + D[i] + "  ");
        }      
        System.out.println();
        
        int sum1 = sumElements(D, 1, 3);
        System.out.println("sum1 = " + sum1);
        
        int sum2 = sumElements(D, 3, 5);
        System.out.println("sum2 = " + sum2);
        
        int sum3 = sumElements(D, 4, 6);
        System.out.println("sum3 = " + sum3);
        
    }
    
    public static int sumElements(int[] D, int k, int m) {
        
        int sum = 0;
        
        for (int i = k; i <= m; i++)
            sum += D[i];
        
        return sum;
        
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
        } while (num <= 6);

        return num;
        
    }
    
}
