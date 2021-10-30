//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

package task15;

import java.util.Scanner;
import java.util.Random;

public class Task15 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        //read m
        System.out.print("m = ");
        int m;
        m = input.nextInt();
        while (m <= 0)
        {
            System.out.print("m = ");
            m = input.nextInt();
        }
        
        //read n
        System.out.print("n = ");
        int n;
        n = input.nextInt();
        while (n <= 0)
        {
            System.out.print("n = ");
            n = input.nextInt();
        }

        Random random = new Random();
        int[][] myArray = new int[m][n];

        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < m; i++)
        {
            for (int a = 0; a < n; a++)
            {
                myArray[i][a] = random.nextInt(51);
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
        
        //Calculations
        int max = 0;
        for (int i = 0; i < m; i++)
            for (int a = 0; a < n; a++)
                if (myArray[i][a] > max) max = myArray[i][a];
        
        System.out.println("max: " + max);
        
        for (int i = 0; i < m; i++)
            for (int a = 0; a < n; a++)
                if (myArray[i][a] % 2 == 1) myArray[i][a] = max;

        //Output
       System.out.println("Output array:");
        for (int i = 0; i < m; i++)
        {
            for (int a = 0; a < n; a++)
            {
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
    }
    
}
