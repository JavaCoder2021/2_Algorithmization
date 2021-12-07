/*
 * 11.
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task11 {
    
    public static void main(String[] args) {
        
        int A = scannerInt("A = ");
        int B = scannerInt("B = ");
               
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
        
        while(number > 0) {
            count++;
            number /= 10;
        }
       
        return count;
        
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
