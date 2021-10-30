//1. Написать метод(методы) для нахождения наибольшего общего делителя и 
//наименьшего общего кратного двух натуральных чисел:

package task1;

import java.util.Scanner;
import java.util.Random;

public class Task1 {

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
        
        long nod = nod(a, b);
        System.out.println("NOD = " + nod);
        
        long nok = nok(a, b);
        System.out.println("NOK = " + nok);
        
    }
    
    private static long nod(long a, long b)
    {
        if (b == 0)
            return a;
        else
            return nod(b, a % b);
    }
    
    private static long nok(long a, long b)
    {
        return a * (b / nod(a, b));
    }
    
}
