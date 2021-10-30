//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.  

package task3;

import java.util.Scanner;
import java.util.Random;

public class Task3 {

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
                myArray[i][a] = random.nextInt(20);
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
        
        //Input k
        System.out.print("k = ");
        int k;
        k = input.nextInt();
        while (k < 1 || k > n)
        {
            System.out.print("k = ");
            k = input.nextInt();
        }
        //Input p
        System.out.print("p = ");
        int p;
        p = input.nextInt();
        while (p < 1 || p > n)
        {
            System.out.print("p = ");
            p = input.nextInt();
        }
 
        //Output
        //String k
        System.out.println("Output String k:");
        for (int a = 0; a < n; a++)
        {
            System.out.print(myArray[k - 1][a] + "\t");
        }
        System.out.println();
        //Column p
        System.out.println("Output Column p:");
        for (int i = 0; i < n; i++)
        {
            for (int a = 0; a < n; a++)
            {
                if (p == a + 1)
                    System.out.print(myArray[i][a] + "\t");
                else 
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    
}
