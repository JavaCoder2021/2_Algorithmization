//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

package task7;

public class Task7 {

    public static void main(String[] args) {

        int sum = sumFactorials();
        System.out.println("sum = " + sum); 
        
    }
    
    public static int sumFactorials() {
        
        int factorial = 1, until = 9;   
        int sum = 0;                    
 
        for (int i = 1; i <= until; i += 2)
        {
            for (int j = 1; j <= i; j++)
            {
                factorial = factorial * j;
            }
            sum += factorial;
            factorial = 1;
        }    
            
       return sum;
        
    }
    
}
