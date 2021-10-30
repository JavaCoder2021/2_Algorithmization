//2. Даны две последовательности 
//   Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
//   Примечание. Дополнительный массив не использовать

package task2;

import java.util.Scanner;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        int size1;
        System.out.print("First array size = ");
        size1 = input.nextInt();
        while (size1 <= 0)
        {
            System.out.print("First array size = ");
            size1 = input.nextInt();
        }
        
        int size2;
        System.out.print("Second array size = ");
        size2 = input.nextInt();
        while (size2 <= 0)
        {
            System.out.print("Second array size = ");
            size2 = input.nextInt();
        }
        
        Random random = new Random();
        int[] myArray1 = new int[size1];
        int[] myArray2 = new int[size2];
        int[] myArray3 = new int[size1 + size2];
        
        //Create array 1
        System.out.println("Array 1:");
        for (int i = 0; i < size1; i++)
        {
            myArray1[i] = i;
            System.out.print(" " + myArray1[i] + " ");
        }    
        System.out.println();
        
        //Create array 2
        System.out.println("Array 2:");
        for (int i = 0; i < size2; i++)
        {
            myArray2[i] = i+1;
            System.out.print(" " + myArray2[i] + " ");
        }  
        System.out.println();
        
        //Calculations
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < myArray3.length; i++)
        {
            if (tmp2 >= myArray2.length || (tmp1 < myArray1.length && myArray1[tmp1] < myArray2[tmp2]))
            {
                myArray3[i] = myArray1[tmp1];
                tmp1++;
            } 
            else
            {
                myArray3[i] = myArray2[tmp2];
                tmp2++;
            }
        }
                     
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray3.length; i++)
            System.out.print(" " + myArray3[i] + " ");
        System.out.println();

    }
    
}
