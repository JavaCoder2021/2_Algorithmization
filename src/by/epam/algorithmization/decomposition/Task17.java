/*
 * 17.
 * Из заданного числа вычли сумму его цифр.
 * Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task17 {
    
    public static void main(String[] args) {
        
        int number = scannerInt("number = ");
                
        int count = countNumber(number);
        
        output(count);      
        
    }
    
    //Input
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
    
    //Get sum Numbers
    public static int getSumNumber(int number) {
        
        int sum = 0;
        
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
        
    }
    
    //Calculations
    public static int countNumber(int number) {
        
        int count = 0;
        
        while (number != 0) {
            number -= getSumNumber(number);
            count++;
            System.out.println(number);    
        }
         
        return count;
        
    }
    
    //Output
    public static void output(int count) {
        
        System.out.println("count = " + count);
        
    }
    
}
