//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
//Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. 

package task17;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
 
        int number;
        System.out.print("number = ");
        number = input.nextInt();
        while (number <= 0)
        {
            System.out.print("number = ");
            number = input.nextInt();
        }
         
        int count = countNumber(number);
        
        System.out.println("count = " + count);         
        
    }
    
    public static int countNumber(int number) {
        
        int count = 0;
        int sum = 0;
        int tmp;
        
        while (number != 0)
        {
            sum = 0;
            tmp = number;
            while(tmp > 0)
            {
                sum += tmp % 10;
                tmp /= 10;
            }
            number -= sum;  
            count++;
            System.out.println(number);    
        }
         
        return count;
        
    }
    
}
