//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n  - заданное натуральное число больше 2. Для 
//решения задачи использовать декомпозицию. 

package task13;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        
        int n = inputN();
        
        String s = calculations(n);
        
        output(s);        
        
    }
    
    //Input
    public static int inputN() {
     
        //Input
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n = input.nextInt();
        while (n <= 2)
        {
            System.out.print("n = ");
            n = input.nextInt();
        }
        
        return n;
        
    }
    
    //Prime number
    public static boolean simple(int num) {
        
        if (num <= 1)
        {
            return false;
        }
        else
        {
            for(int i = 2; i <= Math.sqrt(num); i++)
            {
                if(num % i == 0)
                {
                    return false;
                }
            } 
            return true;
        }
        
    }
    
    //Calculations
    public static String calculations(int n) {
        
        String s = "";
        
        for(int i = n; i < n * 2 - 1; i++)
        {
            if(simple(i) && simple(i+2))
            {
                s += "  " + i + " and " + (i + 2) + "  ";
            }
        }   
        
        return s;
        
    }
    
    //output
    public static void output(String s) {
        
        System.out.println(s);
        
    }
    
}
