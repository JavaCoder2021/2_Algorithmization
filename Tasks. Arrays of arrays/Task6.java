//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

package task6;

import java.util.Scanner;

public class Task6 {

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
        
        int[][] myArray = new int[n][n];
        
        //Calculations
        for (int i = 0; i < n / 2; i++)
            for (int j = 0; j < n / 2; j++) 
            {

                int value = (i > j) ? 0 : 1;
                int invI = n - i - 1;
                int invJ = n - j - 1;

                myArray[i][j] = value;
                myArray[invI][j] = value;
                myArray[i][invJ] = value;
                myArray[invI][invJ] = value;
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
