//14.  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
//причем в каждом столбце число единиц равно номеру столбца. 

package task14;

import java.util.Scanner;
import java.util.Random;

public class Task14 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        //read m
        System.out.print("m = ");
        int m;
        m = input.nextInt();
        while (m <= 0)
        {
            System.out.print("m = ");
            m = input.nextInt();
        }
        
        //read n
        System.out.print("n = ");
        int n;
        n = input.nextInt();
        while (n <= 0 || n > m)
        {
            System.out.print("n = ");
            n = input.nextInt();
        }

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
            for (int a = 0; a < n; a++)
            {
                tmpA = random.nextInt(n);
                if (tmpA != a)
                {
                    tmp = myArray[i][a];
                    myArray[i][a] = myArray[tmpA][a];
                    myArray[tmpA][a] = tmp;
                }
            }

        //Output
       System.out.println("Output array:");
        for (int i = 0; i < m; i++)
        {
            for (int a = 0; a < n; a++)
            {
                System.out.print(myArray[i][a] + "\t");
            }
            System.out.println();
        }
    }
    
}
