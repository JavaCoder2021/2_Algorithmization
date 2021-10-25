//2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен
  
package task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Amount of elements = ");
        int n = input.nextInt();
        System.out.print("Z = ");
        double Z = input.nextDouble();
        
        double[] myArray = new double[n];
        int summ = 0;
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < n; i++)
        {
            myArray[i] = (double) (Math.random() * 9 + 1);
            System.out.printf(" %.1f  ", myArray[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < n; i++)
        {
            if (myArray[i] > Z) 
            {
                myArray[i] = Z;
                summ++;
            }
        }
            
        System.out.println("Amount of elements > Z = " + summ);
        for (int i = 0; i < n; i++)
        {
            System.out.printf(" %.1f  ", myArray[i]);            
        }
        System.out.println("");
      
    }
    
}
