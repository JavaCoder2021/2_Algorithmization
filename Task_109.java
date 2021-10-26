//9. Задана матрица неотрицательных чисел. 
//Посчитать  сумму  элементов  в каждом  столбце. Определить,  какой столбец содержит максимальную сумму.   

package task_109;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task_109 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
               
        Random random = new Random();
        int[][] myArray = new int[n][n];
        int sum = 0;
        int column = 0;
        int[] sumArray = new int[n];
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++)
        {
            for (int a = 0; a < myArray.length; a++)
            {
                myArray[i][a] = random.nextInt(20);
                System.out.print(myArray[i][a] + "\t");
                sumArray[a] += myArray[i][a];
             }
            System.out.println();
        }
        
        //Calculations
        System.out.println("Column sum:");
        for (int q = 0; q < n; q++)
        {
            System.out.print(sumArray[q] + "\t");
            if (q == 0) 
            {
                sum = sumArray[q];
                column = 1;
            }
            else
                if (sumArray[q] > sum)
                {
                    sum = sumArray[q];
                    column = q + 1;
                }
        }
        System.out.println();
                
        //Output
        System.out.println("Max column = " + column);

    }
    
}