//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

package task13;

import java.util.Scanner;
import java.util.Random;

public class Task13 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
               
        Random random = new Random();
        int[][] myArray = new int[n][n];
        int tmp;
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++)
        {
            for (int a = 0; a < myArray.length; a++)
            {
                myArray[i][a] = random.nextInt(10);
                System.out.print(myArray[i][a] + "\t");
             }
            System.out.println();
        }
        
        //Calculations Ascending
        System.out.println("Array ascending:");
        for (int i = 0; i < myArray.length; i++) 
        {
            for (int j = 0; j < myArray.length; j++) 
            {
                for (int k = i + 1; k < myArray.length; k++) 
                {
                    if (myArray[i][j] > myArray[k][j]) 
                    {
                        tmp = myArray[i][j];
                        myArray[i][j] = myArray[k][j];
                        myArray[k][j] = tmp;
                    }
                }
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
                      
        //Calculations Desending
        System.out.println("Array descending:");
        for (int i = 0; i < myArray.length; i++) 
        {
            for (int j = 0; j < myArray.length; j++) 
            {
                for (int k = i + 1; k < myArray.length; k++) 
                {
                    if (myArray[i][j] < myArray[k][j]) 
                    {
                        tmp = myArray[i][j];
                        myArray[i][j] = myArray[k][j];
                        myArray[k][j] = tmp;
                    }
                }
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
    
}
