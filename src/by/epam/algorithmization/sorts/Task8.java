/*
 * 8. Даны дроби ( - натуральные). 
 * Составить программу, которая приводит эти дроби к общему 
 * знаменателю и упорядочивает их в порядке возрастания. 
 */
package by.epam.algorithmization.sorts;

import java.util.Scanner;
import java.util.Random;

public class Task8 {
    
    public static void main(String[] args) {
        
        //Input       
        int n = scannerInt("Array size = ");
        
        Random random = new Random();
        Drob[] drob = new Drob[n];
        
        //Create array
        int i;
        int max = 0;
        System.out.println("Array");
        for (i = 0; i < n; i++) {
            drob[i] = new Drob(random.nextInt(9) + 1, i * 2 + 2);
            System.out.printf(" %d/%d ", drob[i].p, drob[i].q);
            if (drob[i].q > max) max = drob[i].q;
        }    
        System.out.println();
        
        //Calculations Common denominator
        boolean getResult = false;
        int count = max - 1;
        //Calculations
        while (getResult == false) {
            count++;
            getResult = true;
            for (i = 0; i < n; i++)
                if (count % drob[i].q != 0)
                   getResult = false;
        }
        System.out.println("Common denominator = " + count);
        
         //Calculations Common denominator
        for (i = 0; i < n; i++) { 
            drob[i].p = count / drob[i].q * drob[i].p;
            drob[i].q = count;
        }  
               
        //Calculations Sort array
        int minValue;
        int min;
        int tmpP;
        for (i = 0; i < n - 1; i++) { 
            min = i;
            minValue = drob[i].p;
            for (int a = i + 1; a < n; a++)
                if (drob[a].p < minValue) {
                    min = a;
                    minValue = drob[a].p;
                }
            tmpP = drob[i].p;
            drob[i].p = drob[min].p;
            drob[min].p = tmpP;
        }
        
        //Output
        System.out.println("Output:");
        for (i = 0; i < n; i++) {
            System.out.printf(" %d/%d ", drob[i].p, drob[i].q);
        }    
        System.out.println();

    }
    
    public static class Drob {
        
        public int p;
        public int q;
        
        public Drob(int p, int q) {
            this.p = p;
            this.q = q;
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
