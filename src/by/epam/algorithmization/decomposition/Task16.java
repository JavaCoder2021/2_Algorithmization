/*
 * 16.
 * Написать программу, определяющую сумму n - значных чисел, 
 * содержащих только нечетные цифры. 
 * Определить также, сколько четных цифр в найденной сумме. 
 * Для решения задачи использовать декомпозицию. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task16 {
    
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
    
    //Grow
    public static boolean grow(long[] A) {
        
        boolean grow = true;
        
        for(int a = 0; a < A.length; a++)
            if (A[a] % 2 == 0)
                grow = false;
        
        return grow;
        
    }
    
    //Get even Numbers
    public static int getEvenNumbers(long[] A) {
        
        int evenNumbers = 0;
        
        for (int a = 0; a < A.length; a++)
                if (A[a] % 2 == 0)
                    evenNumbers++;
        
        return evenNumbers;
        
    }
    
    //Calculations
    public static String calculations(int n) {
        
        String s = "";
        
        int i;
        int sum = 0;
        
        for (i = 1; i <= (int) Math.pow(10, n) - 1; i++) {
            long[] A = arrayNumber(i);
          
            if (grow(A) == true) {
                sum += i;
                s += "  " + i + "  ";                    
            }
            
        }
        
        s += "\n sum = " + sum;
        
        //Get even Numbers
        long[] A = arrayNumber(sum);         
        s += "\n Even numbers = " + getEvenNumbers(A);
        
        return s;
        
    }
      
    //Output
    public static void output(String s) {
        
        System.out.println(s);
        
    }
    
}
