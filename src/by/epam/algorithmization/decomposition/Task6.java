/*
 * 6.
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task6 {
    
    public static void main(String[] args) {
        
        //Input       
        long a = scannerInt("a = ");
        long b = scannerInt("b = ");
        long c = scannerInt("c = ");
        
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
