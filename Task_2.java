//2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
//Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен
  
package task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Количество элементов массива = ");
        int n = input.nextInt();
        System.out.print("Z = ");
        double Z = input.nextDouble();
        
        double[] myArray = new double[n];
        int summ = 0; //Сумма элементов больше Z
        
        //Создаём массив
        for (int i = 0; i < n; i++)
        {
            myArray[i] = (double) (Math.random() * 9 + 1);
            if (i < n-1) System.out.printf(" %.1f  ", myArray[i]);
            else System.out.printf(" %.1f\n", myArray[i]);
        }
        
        for (int i = 0; i < n; i++)
        {
            if (myArray[i] > Z) 
            {
                myArray[i] = Z;
                summ++;
            }
        }
            
        System.out.println("Количество элементов > Z = " + summ);
        for (int i = 0; i < n; i++)
        {
            if (i < n-1) System.out.printf(" %.1f  ", myArray[i]);
            else System.out.printf(" %.1f\n", myArray[i]);
        }
      
    }
    
}