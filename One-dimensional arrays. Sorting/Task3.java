// 3. Сортировка выбором. Дана последовательность чисел 
// Требуется переставить элементы так, чтобы они были расположены по убыванию. 
// Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, 
// а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. 
// Написать алгоритм сортировки выбором. 

package task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.print("Array size = ");
        n = input.nextInt();
        while (n <= 0)
        {
            System.out.print("Array size = ");
            n = input.nextInt();
        }

        int[] myArray = new int[n];
        
        //Create array
        System.out.println("Array:");
        for (int i = 0; i < n; i++)
        {
            myArray[i] = i;
            System.out.print(" " + myArray[i] + " ");
        }    
        System.out.println();
                
        //Calculations
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < myArray.length; i++)
        {
            max = i;
            for (int a = i; a < myArray.length; a++)
            {
                if (myArray[a] > myArray[max]) 
                    max = a;
            } 
            tmp = myArray[i];
            myArray[i] = myArray[max];
	    myArray[max] = tmp;
        }
        
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(" " + myArray[i] + " ");
        System.out.println();

    }
    
}
