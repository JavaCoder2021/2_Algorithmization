//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

package task4;

import java.util.Scanner;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an even number of items: ");
        int n;
        n = input.nextInt();
        while (n % 2 != 0 || n <=0)
        {
            System.out.print("Enter an even number of items: ");
            n = input.nextInt();
        }
        
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
        
        //Calculations
        int valIA;
        for (int i = 0; i < n; i++)
        {
            if (i % 2 != 0)
            for (int a = 0; a < n / 2; a++)
            {
                valIA = myArray[i][a];
                myArray[i][a] = myArray[i][n - a - 1];
                myArray[i][n - a - 1] = valIA;
            }
        }
        
        //Output
       System.out.println("Output array:");
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
