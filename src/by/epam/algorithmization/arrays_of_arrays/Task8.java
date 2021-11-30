/*
 * 8. В числовой матрице поменять местами два столбца любых столбца, 
 * т. е. все элементы одного столбца поставить 
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры.
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task8 {
    
    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("n = ");
               
        Random random = new Random();
        int[][] myArray = new int[n][n];
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++) {
            for (int a = 0; a < myArray.length; a++) {
                myArray[i][a] = random.nextInt(20);
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }

        int column_1 = scannerIntCoulumn("Column_1 = ", n);
        int column_2 = scannerIntCoulumn("Column_2 = ", n);
        
        //Calculations
        int valIA;
        for (int i = 0; i < n; i++) {
                valIA = myArray[i][column_1 - 1];
                myArray[i][column_1 - 1] = myArray[i][column_2 - 1];
                myArray[i][column_2 - 1] = valIA;
        }
 
        //Output
        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < n; a++)
            {
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
        
    }
    
    private static int scannerIntCoulumn(String str, int n) {
        
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
        } while (num > n || num <= 0);

        return num;
        
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
