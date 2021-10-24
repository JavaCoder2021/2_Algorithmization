//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. 
  
package task_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Количество элементов массива = ");
        int n = input.nextInt();
        
        double[] myArray = new double[n];
        int maxN = 0;
        int minN = 0;       
        double maxA = 0;
        double minA = 0;
             
        //Создаём массив
        for (int i = 0; i < n; i++)
        {
            myArray[i] = (double) (Math.random() * 20) - 10;
            if (i < n-1) System.out.printf(" %.1f  ", myArray[i]);
            else System.out.printf(" %.1f\n", myArray[i]);
        }
        
        //Вычисления 
        for (int i = 0; i < n; i++)
        {
            if (i==0) {
                maxN = 0;
                minN = 0;
                maxA = myArray[0];
                minA = myArray[0];
            }
            else
            {
                //Ищем максимальный элемент
                if (myArray[i] > maxA) 
                {
                    maxN = i;
                    maxA = myArray[i]; 
                }
                //Ищем минимальный элемент
                if (myArray[i] < minA) 
                {
                    minN = i;
                    minA = myArray[i]; 
                }
            }
        }  
        
        //Меняем элементы местами
        myArray[maxN] = minA;
        myArray[minN] = maxA;
        
        //Выводим массив
        for (int i = 0; i < n; i++)
        {
            if (i < n-1) System.out.printf(" %.1f  ", myArray[i]);
            else System.out.printf(" %.1f\n", myArray[i]);
        }
        
    }
    
}