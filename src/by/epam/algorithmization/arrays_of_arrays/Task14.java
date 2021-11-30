/*
 * 14.  
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца. 
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task14 {
    
    public static void main(String[] args) {
        
        //Input       
        int m = scannerInt("m = ");
        int n = scannerInt("n = ");

        Random random = new Random();
        int[][] myArray = new int[m][n];

        //Create an array
        for (int i = 0; i < m; i++)
            for (int a = 0; a < n; a++)
                myArray[i][a] = (i > a) ? 0 : 1;
        
        //Calculations
        int tmp = 0;
        int tmpA = 0;
        for (int i = 0; i < m; i++)
            for (int a = 0; a < n; a++) {
                tmpA = random.nextInt(m);
                if (tmpA != a) {
                    tmp = myArray[i][a];
                    myArray[i][a] = myArray[tmpA][a];
                    myArray[tmpA][a] = tmp;
                }
            }

        //Output
        System.out.println("Output array:");
        for (int i = 0; i < m; i++) {
            for (int a = 0; a < n; a++) {
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
        } while (num <= 0);

        return num;
        
    }
    
}
