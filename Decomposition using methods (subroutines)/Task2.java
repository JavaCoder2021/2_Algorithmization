//2. Написать метод(методы) для нахождения наибольшего общего делителя 
//четырех натуральных чисел. 

package task2;

import java.util.Scanner;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        long a;
        System.out.print("a = ");
        a = input.nextInt();
        while (a <= 0)
        {
            System.out.print("a = ");
            a = input.nextInt();
        }
        
        long b;
        System.out.print("b = ");
        b = input.nextInt();
        while (b <= 0)
        {
            System.out.print("b = ");
            b = input.nextInt();
        }
        
        long c;
        System.out.print("c = ");
        c = input.nextInt();
        while (c <= 0)
        {
            System.out.print("c = ");
            c = input.nextInt();
        }
        
        long d;
        System.out.print("d = ");
        d = input.nextInt();
        while (d <= 0)
        {
            System.out.print("d = ");
            d = input.nextInt();
        }
        
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
    
}
