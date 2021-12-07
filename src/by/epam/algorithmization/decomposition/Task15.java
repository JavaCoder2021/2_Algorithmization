/*
 * 15.
 * Найти все натуральные n-значные числа, цифры в которых образуют 
 * строго возрастающую последовательность (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task15 {
    
    public static void main(String[] args) {
        
        int n = scannerInt("n = ");
        
        String s = calculations(n);
        
        output(s);
        
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
    
    //Get the digits of a number
    public static long[] arrayNumber(int n) {
        
        int count = 0;
        int temp = n;
        
        while(temp > 0) {
            count++;
            temp /= 10;
        }
        
        long[] A = new long[count];
        
        int j = count - 1;
        
        while(n > 0) {
            A[j--] = n % 10;
            n /= 10;
        }
        
        return A;
        
    }
    
    //Calculations
    public static String calculations(int n) {
        
        String s = "";
        int i, a;
        boolean grow;
        
        for (i = 10; i <= (int) Math.pow(10, n) - 1; i++) {
            long[] A = arrayNumber(i);
            grow = true;
            for(a = 1; a < A.length; a++)
                if (A[a - 1] >= A[a])
                    grow = false;
            if (grow == true)
                s += "  " + i + "  ";
        }
        System.out.println();
        
        return s;
        
    }
    
    //Output
    public static void output(String s) {
        
        System.out.println(s);
        
    }
    
}
