/*
 * 1. 
 * Написать метод (методы) для нахождения наибольшего общего делителя и 
 * наименьшего общего кратного двух натуральных чисел:
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        long a = scannerInt("a = ");
        long b = scannerInt("b = ");
        
        System.out.println("NOD = " + nod(a, b));
        
        System.out.println("NOK = " + nok(a, b));
        
    }
    
    private static long nod(long a, long b) {
        
        if (b == 0)
            return a;
        else
            return nod(b, a % b);
        
    }
    
    private static long nok(long a, long b) {
        
        return a * (b / nod(a, b));
        
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
