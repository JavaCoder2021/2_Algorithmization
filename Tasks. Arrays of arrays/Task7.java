//7. Сформировать квадратную матрицу порядка N по правилу:  
//и подсчитать количество положительных элементов в ней. 

package task7;

import java.util.Scanner;
import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in); 
        
        System.out.print("N = ");
        int N;
        N = input.nextInt();
        while (N <=0)
        {
            System.out.print("N = ");
            N = input.nextInt();
        }
               
        Random random = new Random();
        double[][] myArray = new double[N][N];
        int sum = 0;
        
        //Calculations
        System.out.println("Array:");
        for (int I = 0; I < myArray.length; I++)
        {
            for (int J = 0; J < myArray.length; J++)
            {
                myArray[I][J] = Math.sin((I * I - J * J) / N);
                if (myArray[I][J] > 0) sum++;
                System.out.printf("%.1f \t", myArray[I][J]);
            }
            System.out.println();
        }
        
        //Output
        System.out.println("sum = " + sum);
    }
    
}
