//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить наименьшее из них.

package task_9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task_9 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Elements in an array: ");
        int n = input.nextInt();
        
        Random random = new Random();
        int[] myArray = new int[n];
 
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = random.nextInt(20) - 10;
            System.out.printf(" %d  ", myArray[i]);
        }
        System.out.println("");
        
        int nCount = myArray[0];
        int nCountMax = 1;
        
        int nCountNow = 0;
        int nCountMaxNow = 0;
        
        //Calculations
        for (int i = 0; i < myArray.length; i++)
        {
            nCountMaxNow = 0;
            for (int a = 0; a < myArray.length; a++)
            {
                if (myArray[a] == myArray[i])
                {
                    if (nCountMaxNow == 0) 
                        nCountNow = myArray[i];
                    nCountMaxNow++;
                }    
            }
            if (nCountMaxNow > nCountMax)
            {
                nCount = nCountNow;
                nCountMax = nCountMaxNow;
            }
            else if (nCountMaxNow == nCountMax && nCountNow < nCount)
            {
                nCount = nCountNow;
                nCountMax = nCountMaxNow;
            }
        }
        
        //Output
        System.out.println("Most common number: " + nCount);

    }
    
}