/*
 * 5.
 * Сортировка вставками. Дана последовательность чисел 
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом. 
 * Пусть - упорядоченная последовательность, т.  е. . Берется следующее число и вставляется в последовательность так,  
 * чтобы новая последовательность была тоже возрастающей. 
 * Процесс производится до тех пор, пока все элементы от  i +1 до n не будут перебраны. 
 * Примечание. Место помещения очередного элемента в отсортированную часть производить 
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
package by.epam.algorithmization.sorts;

import java.util.Scanner;
import java.util.Random;

public class Task5 {
    
    public static void main(String[] args) {
        
        //Input       
        int n = scannerInt("Array size = ");

        Random random = new Random();
        int[] myArray = new int[n];
        
        //Create array
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = random.nextInt(20);
            System.out.print(" " + myArray[i] + " ");
        }    
        System.out.println();
                
        //Calculations
        insertionSort(myArray);
        
        //Output
        System.out.println("Output array:");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(" " + myArray[i] + " ");
        System.out.println();
        
    }
    
    public static int[] insertionSort(int[] numbers) {
        
        for (int i = 0; i < numbers.length; i++) {
            int copyNumber = numbers[i];
            int j = i;
            while (j > 0 && copyNumber < numbers[j-1]) {
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] = copyNumber;
        }
        
        return numbers;
        
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
