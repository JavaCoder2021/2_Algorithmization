//5. Даны целые числа а1 ,а2 ,..., аn . 
//Вывести на печать только те числа, для которых аi > i. 
package task5;

import java.util.Scanner;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Amount of elements = ");
        int n = input.nextInt(); 
        Random random = new Random();
        int[] myArray = new int[n];
        
        System.out.println("Array:");
        for (int i = 0; i < n; i++)
        {
            myArray[i] = random.nextInt(20) - 10;
            System.out.printf(" %d  ", myArray[i]);
        }
        System.out.println("");
        
        System.out.println("Elements > i");
        for (int i = 0; i < n; i++)
        {
            if (myArray[i] > i) System.out.printf(" %d  ", myArray[i]);
        }   
        System.out.println("");
        
    }
    
}
