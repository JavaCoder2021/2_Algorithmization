//16.  Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры. 
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию. 

package task16;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
 
        int n;
        System.out.print("n = ");
        n = input.nextInt();
        while (n <= 0)
        {
            System.out.print("n = ");
            n = input.nextInt();
        }
         
        int i, a;
        boolean grow;
        int sum = 0;
        for (i = 1; i <= (int) Math.pow(10, n) - 1; i++)
        {
            long[] A = arrayNumber(i);
            grow = true;
            for(a = 0; a < A.length; a++)
                if (A[a] % 2 == 0)
                    grow = false;
            if (grow == true)
            {
                sum += i;
                System.out.printf("  %d  ", i);
            }
        }
        System.out.println();
        System.out.println("sum = " + sum);
        
        int evenNumbers = 0;
        long[] A = arrayNumber(sum);
        for(a = 0; a < A.length; a++)
                if (A[a] % 2 == 0)
                    evenNumbers++;
        System.out.println("Even numbers = " + evenNumbers);         
        
    }
    
    public static long[] arrayNumber(int n) {
        
        int count = 0;
        int temp = n;
        while(temp > 0)
        {
            count++;
            temp /= 10;
        }
        
        long[] A = new long[count];
        
        int j = count - 1;
        
        while(n > 0)
        {
            A[j--] = n % 10;
            n /= 10;
        }
        
        return A;
        
    }
    
}
