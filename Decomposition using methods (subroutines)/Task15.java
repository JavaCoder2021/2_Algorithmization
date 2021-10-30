//15.  Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую 
//последовательность (например, 1234, 5789). 
//Для решения задачи использовать декомпозицию. 

package task15;

import java.util.Scanner;

public class Task15 {

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
        for (i = 10; i <= (int) Math.pow(10, n) - 1; i++)
        {
            long[] A = arrayNumber(i);
            grow = true;
            for(a = 1; a < A.length; a++)
                if (A[a - 1] >= A[a])
                    grow = false;
            if (grow == true)
                System.out.printf("  %d  ", i);
        }
        System.out.println();
        
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
