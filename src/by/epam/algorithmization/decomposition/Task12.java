/*
 * 12.
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,  
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task12 {
    
    public static void main(String[] args) {
        
        int K = scannerInt("K = ");
        int N = scannerInt("N = ");
        
        int[] A = countNumberSumK(K, N);
        
        for (int i = 0; A[i] > 0; i++)
            System.out.printf("  %d  ", A[i]);
        System.out.println();
        
    }
    
    public static int[] countNumberSumK(int K, int N) {
        
        int count, number, a, countNumber; 
        int[] myArray = new int[10];
        int countA = 0;
        int[] A = new int[100];
        
        for (int i = 1; i < N; i++) {
            
            count = 0;
            number = i;
            countNumber = 0;
            
            while (number > 0) {
                myArray[count++] = number % 10;
                number /= 10;
            }
            
            for (a = 0; a < count; a++)
                countNumber += myArray[a];
            
            if (countNumber == K) {
                A[countA] = i;
                countA++;
            }
            
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
