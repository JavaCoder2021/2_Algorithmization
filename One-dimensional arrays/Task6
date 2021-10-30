//6. Задана  последовательность  N  вещественных  чисел.  
//Вычислить  сумму  чисел,  порядковые  номера  которых являются простыми числами. 
  
package task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Amount of elements = ");
        int N = input.nextInt();
        while (N < 1)
        {
            System.out.print("Amount of elements = ");
            N = input.nextInt();
        }
        
        double[] myArray = new double[N];
        double sum = 0.0;
             
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < N; i++)
        {
            myArray[i] = (double) (Math.random() * 20) - 10;
            System.out.printf(" %.2f  ", myArray[i]);
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
                sum += myArray[i - 1];
                System.out.println("prime: " + i);
            }  
        }
        
        System.out.printf("Sum: %.2f \n", sum);
    }
    
}
