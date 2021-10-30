//3.  Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  
//используя  метод  вычисления  площади треугольника. 

package task3;

import java.util.Scanner;

public class Task3 {
      
    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        double a;
        System.out.print("a = ");
        a = input.nextDouble();
        while (a <= 0)
        {
            System.out.print("a = ");
            a = input.nextDouble();
        }
        
        //Calculations
        double area = hexagonArea(a);
            
        //Output
        System.out.printf("area = %.2f \n", area);

    }
    
    public static double hexagonArea(double a) {
        
        return (6 * (a * a))/(4 * Math.tan(Math.PI / 6));
        
    }
    
}
