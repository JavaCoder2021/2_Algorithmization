/*
 * 6. 
 * Сортировка Шелла.
 * Дан массив n действительных чисел. 
 * Требуется упорядочить его по возрастанию. 
 * Делается это следующим образом: сравниваются два соседних элемента 
 */
package by.epam.algorithmization.sorts;

import java.util.Scanner;

public class Task6 {
    
    public static void main(String[] args) {
        
        //Input        
        int n = scannerInt("Array size = ");

        double[] myArray = new double[n];
        int i = 0;
        
        //Create array
        System.out.println("Array:");
        for (i = 0; i < n; i++) {
            myArray[i] = Math.random() * 10;
            System.out.printf(" %.1f ", myArray[i]);
        }    
        System.out.println();
                
        //Calculations
        double tmp = 0;
        i = 0;
        int count = 0;
        while (i < myArray.length - 1) {
            if (myArray[i] <= myArray[i + 1]) {
		i++;
	    } 
            else {
                count = i;
                while(myArray[count] > myArray[count + 1]) {    
                    tmp = myArray[count];
                    myArray[count] = myArray[count + 1];
                    myArray[count + 1] = tmp;
                    count--;
                    if (count < 0) 
                        break;
                }
            }
        }
        
        //Output
        System.out.println("Output array:");
        for (i = 0; i < myArray.length; i++)
            System.out.printf(" %.1f ", myArray[i]);
        System.out.println();
        
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
