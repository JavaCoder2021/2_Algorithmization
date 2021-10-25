//6. Задана  последовательность  N  вещественных  чисел.  
//Вычислить  сумму  чисел,  порядковые  номера  которых являются простыми числами. 
  
package task_6;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Amount of elements = ");
        int N = input.nextInt();
        
        double[] myArray = new double[N];
        double sum = 0.0;
             
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < N; i++)
        {
            myArray[i] = (double) (Math.random() * 20) - 10;
            System.out.printf(" %.1f  ", myArray[i]);
        }
        System.out.println("");
       
        //Calculations 
        for (int i = 2; i < N; i++)
        {
            boolean primeNumber = true;
            for (int a = 2; a < i; a++)
            {
                if (i % a == 0) primeNumber = false;
            }
            if (primeNumber == true) 
            {
                sum += myArray[i];
                System.out.println("prime: " + i);
            }  
        }
        
        System.out.println("Sum: " + sum);
    }
    
}