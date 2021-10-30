//8.  Дана  последовательность  целых  чисел  .  
//Образовать  новую  последовательность,  выбросив  из исходной те члены, которые равны  min.

package task8;

import java.util.Scanner;
import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Elements in an array: ");
        int n = input.nextInt();
        
        Random random = new Random();
        int[] myArray = new int[n];
        int min = 0;
 
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = random.nextInt(20) - 10;
            System.out.printf(" %d  ", myArray[i]);
            //Calculations
            if (i == 0 ) 
                min = myArray[i];
            else if (myArray[i] < min)
                min = myArray[i];
        }
        System.out.println("\n min = " + min);
        
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray.length; i++)
        {
            if (myArray[i] != min)
            System.out.printf(" %d  ", myArray[i]);
        }
        System.out.println("");

    }
    
}
