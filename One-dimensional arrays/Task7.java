//7. Даны действительные числа a , a	2	,   , a	n	. Найти										
//max( a + a	2n	, a	2	+ a	2n −1	,   , a	n	+ a	n +1	) .

package task7;

import java.util.Scanner;
import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = 0;

        double max = 0.0;
        
        System.out.print("Enter an even number of items: ");
        n = input.nextInt();
        while (n % 2 != 0)
        {
            System.out.print("Enter an even number of items: ");
            n = input.nextInt();
        }
        
        double[] myArray = new double[n];
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < n; i++)
        {
            myArray[i] = (double) (Math.random() * 20) - 10;
            System.out.printf(" %.3f  ", myArray[i]);
        }
        System.out.println("");
        
        //Calculations
        for (int i = 0; i < n/2; i++)
        {
            if (i == 0 ) 
                max = myArray[i] + myArray[n - 1 - i];
            else if ((myArray[i] + myArray[n - 1 - i]) > max) 
                max = myArray[i] + myArray[n - 1 - i];
        }           
                
        System.out.printf("max = %.3f \n", max);
        
    }
    
}
