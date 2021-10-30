//8. В числовой матрице поменять местами два столбца любых столбца, 
//т. е. все элементы одного столбца поставить 
//на соответствующие им позиции другого, а его элементы второго переместить в первый. 
//Номера столбцов вводит пользователь с клавиатуры.  

package task8;

import java.util.Scanner;
import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
               
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
        
        //Input column_1
        System.out.print("Column_1 = ");
        int column_1;
        column_1 = input.nextInt();
        while (column_1 < 1 || column_1 > n)
        {
            System.out.print("Column_1 = ");
            column_1 = input.nextInt();
        }
        //Input column_2
        System.out.print("Column_2 = ");
        int column_2;
        column_2 = input.nextInt();
        while (column_2 < 1 || column_2 > n)
        {
            System.out.print("Column_2 = ");
            column_2 = input.nextInt();
        }
        
        //Calculations
        int valIA;
        for (int i = 0; i < n; i++)
        {
                valIA = myArray[i][column_1 - 1];
                myArray[i][column_1 - 1] = myArray[i][column_2 - 1];
                myArray[i][column_2 - 1] = valIA;
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
