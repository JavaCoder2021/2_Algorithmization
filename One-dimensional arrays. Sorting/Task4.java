// 4. Сортировка  обменами.  Дана  последовательность  чисел  .
// Требуется  переставить  числа  в порядке  возрастания.  
// Для  этого  сравниваются  два  соседних  числа  .  Если  ,  то  делается перестановка. 
// Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок. 

package task4;

import java.util.Scanner;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
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
            myArray[i] = random.nextInt(20);
            System.out.print(" " + myArray[i] + " ");
        }    
        System.out.println();
                
        //Calculations
        boolean check = true;
        int tmp;
	int count = 0;
        while (check) 
        {
            check = false;
            for (int i = 0; i < myArray.length - 1; i++) 
            {
                if (myArray[i] > myArray[i + 1]) 
                {
                    check = true;
                    count++;
                    tmp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = tmp;
                }
            }
        }
        
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(" " + myArray[i] + " ");
        System.out.println("\n count = " + count);

    }
    
}
