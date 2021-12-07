/*
 * 9.
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y — прямой. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task9 {
    
    public static void main(String[] args) {

        double X = scannerDouble("X = ");
        double Y = scannerDouble("Y = ");
        double Z = scannerDouble("Z = ");
        double T = scannerDouble("T = ");
        
        System.out.println("area = " + triangleArea(X, Y, Z, T));
               
    }
    
    public static double triangleArea(double X, double Y, double Z, double T) {
        
        double D = Math.sqrt(X * X + Y * Y);
        double area1 = (X * Y) / 2;
        double area2 = Math.sqrt((D + Z + T) * (D + Z - T) * (D + T - Z) * (Z + T - D)) / 4;
        double area = area1 + area2;
        
        return area;
        
    }
    
    private static double scannerDouble(String str) {
        
        Scanner input = new Scanner(System.in);
        double num = -1;
        
        do {
            System.out.print(str);
            if (input.hasNextDouble()) {
                num = input.nextDouble();
            } 
            else {
                input.next();
            }
        } while (num <= 0);

        return num;
        
    }
    
}
