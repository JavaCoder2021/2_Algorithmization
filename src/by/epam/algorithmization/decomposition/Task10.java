/*
 * 10.
 * Дано натуральное число N. Написать метод(методы) для формирования массива,  
 * элементами которого являются цифры числа N.
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task10 {
    
    public static void main(String[] args) {
        
        //Input
        int number = scannerInt("number = ");
               
        int[] A = arrayNumber(number);
        
        for (int i = 0; i < A.length; i++)
            System.out.printf("  %d  ", A[i]);
        System.out.println();
        
    }
    
    public static int[] arrayNumber(int number) {
        
        int count = 0;
        int temp = number;
        
        while(temp > 0) {
            count++;
            temp /= 10;
        }
        
        int[] A = new int[count];
        
        int j = count - 1;
        
        while(number > 0) {
            A[j--] = number % 10;
            number /= 10;
        }
        
        return A;
        
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
