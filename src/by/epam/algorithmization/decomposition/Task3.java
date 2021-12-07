/*
 * 3.
 * Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  
 * используя  метод  вычисления  площади треугольника. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
        
        double a = scannerInt("a = ");
        
        double area = 6 * triangleArea(a);     
        
        System.out.printf("area = %.3f \n", area);

    }
    
    public static double triangleArea(double a) {
        
        return ((a * a * Math.sqrt(3)) / 4 );
        
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
