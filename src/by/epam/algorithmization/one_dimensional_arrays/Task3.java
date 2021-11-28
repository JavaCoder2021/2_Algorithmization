/*
 * 3.  
 * Дан  массив  действительных  чисел,  размерность  которого  N.  
 * Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов. 
 */
package by.epam.algorithmization.one_dimensional_arrays;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        
        int N = scannerInt("Amount of elements = ");
        
        double[] myArray = new double[N];
        int Positive = 0;
        int Zero = 0;
        int Negative = 0;
        
        //Create an array
        System.out.println("Array:");
        for (int i = 0; i < N; i++) {
            myArray[i] = (double) (Math.random() * 20) - 10;
            System.out.printf(" %.1f  ", myArray[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < N; i++) {
            if (myArray[i] > 0) 
                Positive++;
            else if (myArray[i] == 0) 
                Zero++;
            else Negative++;
        }
            
        System.out.println("Positive = " + Positive);
        System.out.println("Zero = " + Zero);  
        System.out.println("Negative = " + Negative);
        
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
