/*
 * 16. 
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, 
 * составленная из чисел 1, 2, 3, ...,2n
 * так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. 
 * Построить такой квадрат.
 */
package by.epam.algorithmization.arrays_of_arrays;

import java.util.Scanner;

public class Task16 {
    
    public static void main(String[] args) {
            
        //Input
        int n = scannerInt("Give an odd number: ");
        
        int[][] myArray = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        while (number <= n * n) {
            
            myArray[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            
            if (row == -1) 
                row = n - 1;
            
            if (column == n) 
                column = 0;
            
            if (myArray[row][column] != 0) {
                
                row = curr_row + 1;
                column = curr_col;
                
                if (row == -1) 
                    row = n - 1;
                
            }
            
        }

        //Output
        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
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
        } while (num % 2 == 0 || num <= 0);

        return num;
        
    }
    
}
