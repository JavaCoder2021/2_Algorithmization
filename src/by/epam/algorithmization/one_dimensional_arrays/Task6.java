/*
 * 6. 
 * Задана  последовательность  N  вещественных  чисел.  
 * Вычислить  сумму  чисел,  порядковые  номера  которых являются простыми числами. 
 */
package by.epam.basics.algorithmization.one_dimensional_arrays;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        
        int N = scannerInt("Amount of elements = ");
        
        double[] myArray = new double[N];
        double sum = 0.0;
             
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < N; i++) {
            myArray[i] = (double) (Math.random() * 20) - 10;
            System.out.printf("N[%d] %.2f;  ", i, myArray[i]);
        }
        System.out.println("");
       
        //Calculations 
        for (int i = 2; i < N; i++) {
            boolean primeNumber = true;
            for (int a = 2; a < i; a++) {
                if (i % a == 0) 
                    primeNumber = false;
            }
            if (primeNumber == true) {
                sum += myArray[i];
                System.out.println("prime: " + i);
            }  
        }
        
        System.out.printf("Sum: %.2f \n", sum);
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
