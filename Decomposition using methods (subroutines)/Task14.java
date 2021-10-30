//14.  Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр, 
//возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  
//Для  решения  задачи использовать декомпозицию. 
 
package task14;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);

        int k;
        System.out.print("k = ");
        k = input.nextInt();
        while (k <= 0)
        {
            System.out.print("k = ");
            k = input.nextInt();
        } 
        
        int[] A = armstrongNumbers(k);
        
        for (int i =1; i < A.length; i++)
            if (A[i] > 0)
                System.out.printf(" %d ", A[i]);
        System.out.println();
        
    }
        
    public static int[] armstrongNumbers(int k) {
        
        int count, number, a, countNumber, sumN; 
        int[] myArray = new int[10];
        int[] A = new int[100];
        int countInArray = 0;
        
        for (int i = 1; i <= k; i++)
        {
            count = 0;
            number = i;
            countNumber = 0;
            number = i;
            sumN = 0;
            while( number > 0) //Number of digits
            {
                myArray[count++] = number % 10;
                number /= 10;
            }
            for (a = 0; a < count; a++) //Sum of digits
            {
                countNumber += myArray[a]; 
                sumN += Math.pow(myArray[a], count);
            }
            if (i == sumN)
            {
                A[countInArray] = i;
                countInArray++;
            }
                
        }
        
        return A;
        
    }
    
}
