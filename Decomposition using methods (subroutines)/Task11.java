//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

package task11;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
 
        int A;
        System.out.print("A = ");
        A = input.nextInt();
        while (A <= 0)
        {
            System.out.print("A = ");
            A = input.nextInt();
        }
        
        int B;
        System.out.print("B = ");
        B = input.nextInt();
        while (B <= 0)
        {
            System.out.print("B = ");
            B = input.nextInt();
        }
               
        int countA = countNumber(A);
        int countB = countNumber(B);
        
        if (countA > countB)
            System.out.println("  A > B  ");
        else if (countA == countB)
            System.out.println("  A == B  ");
        else            
            System.out.println("  B > A  ");
        
    }
    
    public static int countNumber(int number) {
        
        int count = 0;
        
        while(number > 0)
        {
            count++;
            number /= 10;
        }
       
        return count;
        
    }
    
}
