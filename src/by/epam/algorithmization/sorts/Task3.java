/*
 * 3. 
 * Сортировка выбором. Дана последовательность чисел 
 * Требуется переставить элементы так, чтобы они были расположены по убыванию. 
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, 
 * а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. 
 * Написать алгоритм сортировки выбором. 
 */
package by.epam.algorithmization.sort;

public class Task3 {
    
    public static void main(String[] args) {
        
        int[] myArray = new int[10];
        int tmp, i, j, max;
        
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.print(" " + myArray[i] + " ");
        }
        System.out.println();
        
        for (i = 0; i < myArray.length - 1; i++) {
        	max = i;
            for (j = i + 1; j < myArray.length; j++) {
                if (myArray[j] > myArray[max]) 
                	max = j;
            }
            if (myArray[max] > myArray[i]) {
                tmp = myArray[i];
                myArray[i] = myArray[max];
                myArray[max] = tmp;     
            }
        }
        
        for (i = 0; i < myArray.length; i++)
            System.out.print(" " + myArray[i] + " ");

    }
    
}
