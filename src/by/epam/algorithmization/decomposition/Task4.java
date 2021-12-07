/*
 * 4. 
 * На плоскости заданы своими координатами n точек. 
 * Написать метод(методы), 
 * определяющие, между какими из пар точек самое большое расстояние. 
 * Указание. Координаты точек занести в массив. 
 */
package by.epam.algorithmization.decomposition;

import java.util.Scanner;
import java.util.Random;

public class Task4 {
    
    public static void main(String[] args) {
        
        //Input
        int n = scannerInt("Amount of points = ");
        
        Random random = new Random();
        Point[] point = new Point[n];
        
        //Create array
        System.out.println("Points");
        for (int i = 0; i < n; i++) {
            point[i] = new Point(-10.0 + random.nextDouble() * 20.0, -10.0 + random.nextDouble() * 20.0);
            System.out.printf("%.2f, %.2f;   ", point[i].x, point[i].y);
        }    
        System.out.println();
        
        //Calculations
        double maxDistance = 0;
        double distance;
        int pNumber1 = 0;
        int pNumber2 = 0;
        for (int i = 0; i < n - 1; i++)
            for (int a = i + 1; a < n; a++) {              
                distance = Math.sqrt( ( ( point[a].x - point[i].x ) * ( point[a].x - point[i].x ) ) + 
                        ( point[a].y - point[i].y ) * ( point[a].y - point[i].y ) );  
                if (distance > maxDistance) {
                    maxDistance = distance;
                    pNumber1 = i;
                    pNumber2 = a;
                }
            }

        //Output
        System.out.println("Points:");
        System.out.printf("%.2f, %.2f;   ", point[pNumber1].x, point[pNumber1].y);
        System.out.printf("%.2f, %.2f; \n", point[pNumber2].x, point[pNumber2].y);

    }
    
    public static class Point {
        
        public double x;
        public double y;
        
        public Point(double x, double y) {
            
            this.x = x;
            this.y = y;
            
        }
    
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
