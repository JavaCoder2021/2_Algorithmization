//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

package task_105;

import java.util.Arrays;
import java.util.Scanner;

public class Task_105 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an even number of items: ");
        int n;
        n = input.nextInt();
        while (n % 2 != 0)
        {
            System.out.print("Enter an even number of items: ");
            n = input.nextInt();
        }
        
        int[][] myArray = new int[n][n];
        
        //Calculations
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) 
            {

                int value = (i > j) ? 0 : i + 1;
                myArray[i][n - j - 1] = value;
                
            }      
          
        //Output
        System.out.println("Output:");
        for (int i = 0; i < n; i++)
        {
            for (int a = 0; a < n; a++)
            {
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
    }
    
}