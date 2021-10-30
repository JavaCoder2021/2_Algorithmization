// 6. Сортировка Шелла.Дан  массив  n  действительных  чисел.  Требуется  упорядочить  его  по  возрастанию. 
// Делается это следующим образом: сравниваются два соседних элемента 

package task6;

import java.util.Scanner;

public class Task6 {
    
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

        double[] myArray = new double[n];
        int i = 0;
        
        //Create array
        System.out.println("Array:");
        for (i = 0; i < n; i++)
        {
            myArray[i] = Math.random() * 10;
            System.out.printf(" %.1f ", myArray[i]);
        }    
        System.out.println();
                
        //Calculations
        double tmp = 0;
        i = 0;
        int count = 0;
        while (i < myArray.length - 1) 
        {
            if (myArray[i] <= myArray[i + 1]) 
            {
		           i++;
	          } 
            else 
            {
                count = i;
                while(myArray[count] > myArray[count + 1])
                {    
                    tmp = myArray[count];
                    myArray[count] = myArray[count + 1];
                    myArray[count + 1] = tmp;
                    count--;
                    if (count < 0) break;
                }
            }
        }
        
        //Output
        System.out.println("Output array:");
        for (i = 0; i < myArray.length; i++)
            System.out.printf(" %.1f ", myArray[i]);
        System.out.println();
        
    }
    
}
