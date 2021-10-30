//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
//если угол между сторонами длиной X и Y— прямой. 

package task9;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        //Input
        Scanner input = new Scanner(System.in);
        
        double X;
        double Y;
        double Z;
        double T;

        System.out.print("X = ");
        X = input.nextDouble();
        while (X <= 0)
        {
            System.out.print("X = ");
            X = input.nextDouble();
        }
        
        System.out.print("Y = ");
        Y = input.nextDouble();
        while (Y <= 0)
        {
            System.out.print("Y = ");
            Y = input.nextDouble();
        }
        
        System.out.print("Z = ");
        Z = input.nextDouble();
        while (Z <= 0)
        {
            System.out.print("Z = ");
            Z = input.nextDouble();
        }
        
        System.out.print("T = ");
        T = input.nextDouble();
        while (T <= 0)
        {
            System.out.print("T = ");
            T = input.nextDouble();
        }
        
        double area = triangleArea(X, Y, Z, T);
        System.out.println("area = " + area);
               
    }
    
    public static double triangleArea(double X, double Y, double Z, double T) {
        
        double D = Math.sqrt(X * X + Y * Y);
        double area1 = (X * Y) / 2;
        double area2 = Math.sqrt((D + Z + T) * (D + Z - T) * (D + T - Z) * (Z + T - D)) / 4;
        double area = area1 + area2;
        
        return area;
        
    }
    
}
