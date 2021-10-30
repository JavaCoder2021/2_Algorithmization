//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 

package task1;

import java.util.Scanner;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Elements in an array: ");
        int n = input.nextInt();
        
        Random random = new Random();
        int[][] myArray = new int[n][n];
 
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++)
        {
            for (int a = 0; a < myArray.length; a++)
            {
                myArray[i][a] = random.nextInt(20);
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
           
        //Output
        System.out.println("Output:");
        for (int i = 0; i < n; i++)
        {
            for (int a = 0; a < n; a++)
            {
                if (a % 2 == 0)
                {
                    if (myArray[0][a] > myArray[n-1][a])
                        System.out.print(myArray[i][a] + "\t");
                    else 
                        System.out.print("\t");
                }
                else 
                    System.out.print("\t");
            }
            System.out.println();
        }
            
    }
    
}
