//10. Найти положительные элементы главной диагонали квадратной матрицы.    

package task_110;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task_110 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
               
        Random random = new Random();
        int[][] myArray = new int[n][n];
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++)
        {
            for (int a = 0; a < myArray.length; a++)
            {
                myArray[i][a] = random.nextInt(20) - 10;
                System.out.print(myArray[i][a] + "\t");
             }
            System.out.println();
        }
                       
        //Output
        System.out.println("Positive valuses:");
        for (int i = 0; i < myArray.length; i++)
            if (myArray[i][i] > 0) 
                System.out.printf(" %d ", myArray[i][i]);
        System.out.println();

    }
    
}