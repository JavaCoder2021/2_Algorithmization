//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. 

package task6;

import java.util.Scanner;

public class Task6 {

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
        
        if (nod(a, nod(b, c)) == 1)
            System.out.println("True");
        else
            System.out.println("False");
        
    }
    
    private static long nod(long a, long b) {
            
        if (b == 0)
            return a;
        else
            return nod(b, a % b);
        
    }
    
    private static long nod3(long a, long b, long c) {
            
        return nod(a, nod(b, c));
        
    }
    
}
