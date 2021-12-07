/*
 * 2.
 * Написать метод(методы) для нахождения наибольшего общего делителя 
 * четырех натуральных чисел.
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        
        //Input
        long a = scannerInt("a = ");       
        long b = scannerInt("b = ");
        long c = scannerInt("c = ");
        long d = scannerInt("d = ");
        
        long nod = nod4(a, b, c, d);
        System.out.println("NOD = " + nod);   
        
    }
    
    private static long nod(long a, long b) {
            
        if (b == 0)
            return a;
        else
            return nod(b, a % b);
        
    }
    
    private static long nod4(long a, long b, long c, long d) {
            
        return nod(a, nod(b, nod(c, d)));
        
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
