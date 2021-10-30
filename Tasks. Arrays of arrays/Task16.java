//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,2n
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между 
//собой. Построить такой квадрат.

package task16;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
            
        //Input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give an odd number: ");
        int n = input.nextInt();
        while (n<=0 || n % 2 == 0)
        {
            System.out.print("Give an odd number: ");
            n = input.nextInt();
        }
        
        int[][] myArray = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        while (number <= n * n) 
        {
            myArray[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) 
            {
                row = n - 1;
            }
            if (column == n) 
            {
                column = 0;
            }
            if (myArray[row][column] != 0) 
            {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) 
                {
                    row = n - 1;
                }
            }
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
