/*
 * 6. 
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;

public class Task6 {
    
    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("Enter an even number of items: ");
        
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
    
    private static int scannerInt(String str) {
        
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        do {
            System.out.print(str);
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num % 2 !=0 || num <= 0);

        return num;
        
    }    
    
}
