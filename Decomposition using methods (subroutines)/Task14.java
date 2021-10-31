//14.  Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр, 
//возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  
//Для  решения  задачи использовать декомпозицию. 
 
package task14;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        int k = inputK();
        
        int[] A = armstrongNumbers(k);
        
        output(A);
        
    }
    
    //Input
    public static int inputK() {
     
        Scanner input = new Scanner(System.in);
        System.out.print("k = ");
        int  k = input.nextInt();
        while (k <= 0)
        {
            System.out.print("k = ");
            k = input.nextInt();
        }
        
        return k;
        
    }
    
    //Number of digits
    public static int numberOfDigits(int[] myArray, int number) {
        
        int count = 0;
        
        while( number > 0) //Number of digits
        {
            myArray[count++] = number % 10;
            number /= 10;
        }
        
        return count;
        
    }
    
    //Sum of digits
     public static int sumOfDigits(int[] myArray, int count) {
         
        int sumN = 0;
        
        for (int a = 0; a < count; a++) 
            sumN += Math.pow(myArray[a], count); 
         
        return sumN;
         
     }
        
    public static int[] armstrongNumbers(int k) {
        
        int count, number, sumN; 
        int[] myArray = new int[10];
        int[] A = new int[100];
        int countInArray = 0;
        
        for (int i = 1; i <= k; i++)
        {
            count = 0;
            number = i;
            number = i;
            sumN = 0;

            count = numberOfDigits(myArray, number); //Number of digits  
            
            sumN = sumOfDigits(myArray, count); //Sum of digits
            
            if (i == sumN)
            {
                A[countInArray] = i;
                countInArray++;
            }
                
        }
        
        return A;
        
    }
    
     //Output
    public static void output(int[] A) {
        
        for (int i =1; i < A.length; i++)
            if (A[i] > 0)
                System.out.printf(" %d ", A[i]);
        System.out.println();
        
    }
    
}
