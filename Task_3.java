//3.  Дан  массив  действительных  чисел,  размерность  которого  N.  
//Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов. 
  
package task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Количество элементов массива = ");
        int N = input.nextInt();
        
        double[] myArray = new double[N];
        int Positive = 0;
        int Zero = 0;
        int Negative = 0;
        
        //Создаём массив
        for (int i = 0; i < N; i++)
        {
            myArray[i] = (double) (Math.random() * 20) - 10;
            if (i < N-1) System.out.printf(" %.1f  ", myArray[i]);
            else System.out.printf(" %.1f\n", myArray[i]);
        }
        
        for (int i = 0; i < N; i++)
        {
            if (myArray[i] > 0) Positive++;
            else if (myArray[i] == 0) Zero++;
            else Negative++;
        }
            
        System.out.println("Положительные числа = " + Positive);
        System.out.println("Ноль = " + Zero);  
        System.out.println("Отрицательные числа = " + Negative);
        
    }
    
}