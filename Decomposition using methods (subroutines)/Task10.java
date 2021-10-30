//10.  Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  
//элементами  которого являются цифры числа N.

package task10;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
 
        int number;
        System.out.print("number = ");
        number = input.nextInt();
        while (number <= 0)
        {
            System.out.print("number = ");
            number = input.nextInt();
        }
               
        int[] A = arrayNumber(number);
        
        for (int i = 0; i < A.length; i++)
            System.out.printf("  %d  ", A[i]);
        System.out.println();
        
    }
    
    public static int[] arrayNumber(int number) {
        
        int count = 0;
        int temp = number;
        while(temp > 0)
        {
            count++;
            temp /= 10;
        }
        
        int[] A = new int[count];
        
        int j = count - 1;
        
        while(number > 0)
        {
            A[j--] = number %10;
            number/= 10;
        }
        
        return A;
        
    }
    
}
