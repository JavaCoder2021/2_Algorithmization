/*
 * 10. 
 * Дан  целочисленный  массив  с  количеством  элементов  п. 
 * Сжать  массив,  выбросив  из  него  каждый  второй элемент 
 * (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать. 
 */
package by.epam.algorithmization.one_dimensional_arrays;

import java.util.Scanner;
import java.util.Random;

public class Task10 {

    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("Elements in an array: ");
        
        Random random = new Random();
        int[] myArray = new int[n];
 
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(20) - 10;
            System.out.printf(" %d  ", myArray[i]);
        }
        System.out.println("");
             
        //Calculations
        int a = 0;
        for (int i = 2; i < n; i += 2) {
            a++;
            myArray[a] = myArray[i];
        }
        
        int q;
        if (n % 2 == 0) 
            q = n/2; 
        else 
            q = n/2 + 1; 
        for (int i = q; i < n; i++)
            myArray[i] = 0;
        
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf(" %d  ", myArray[i]);
        }
        System.out.println("");

    }
    
    private static int scannerInt(String str) {
        
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        do {
            System.out.print(str);
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num <= 0);

        return num;
        
    }    
    
}
