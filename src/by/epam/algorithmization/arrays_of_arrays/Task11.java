/*
 * 11. 
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, 
 * в которых число 5 встречается три и более раз. 
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Random;

public class Task11 {
    
    public static void main(String[] args) {
              
        Random random = new Random();
                
        final int n = 10;
        final int m = 20;
        
        int[][] myArray = new int[n][m];
        int[] String5 = new int[n];
 
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < m; a++) {
                myArray[i][a] = random.nextInt(16);
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
        
        //Calculations
        for (int i = 0; i < n; i++)
            for (int a = 0; a < m; a++)
                if (myArray[i][a] == 5) String5[i] +=1;
        
        //Output
       System.out.println("Output array:");
        for (int i = 0; i < n; i++)
            if (String5[i] >= 3)
                System.out.println(i + 1);

    }
    
}
