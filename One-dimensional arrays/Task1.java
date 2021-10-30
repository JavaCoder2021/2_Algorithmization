//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 
  
package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Amount of elements = ");
        int n = input.nextInt();
        System.out.print("K = ");
        int K = input.nextInt();
        
        int[] myArray = new int[n];
        int sum = 0; //Sum of elements multiples of K
        
        //Create an array
        for (int i = 0; i < n; i++)
            myArray[i] = (int) (Math.random() * 9 + 1);
        
        for (int i = 0; i < n; i++)
            if (myArray[i] % K == 0) sum += myArray[i];
            
        System.out.println(Arrays.toString(myArray));
        System.out.println("Sum of elements multiples of K = " + sum);
      
    }
    
}
