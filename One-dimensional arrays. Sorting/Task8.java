//8. Даны дроби    (   - натуральные). Составить программу, которая приводит эти дроби к общему 
//знаменателю и упорядочивает их в порядке возрастания. 

package task8;

import java.util.Scanner;
import java.util.Random;

public class Task8 {
      
    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.print("Array size = ");
        n = input.nextInt();
        while (n <= 0)
        {
            System.out.print("Array size = ");
            n = input.nextInt();
        }
        
        Random random = new Random();
        Drob[] drob = new Drob[n];
        
        //Create array
        int i;
        int max = 0;
        System.out.println("Array");
        for (i = 0; i < n; i++)
        {
            drob[i] = new Drob(random.nextInt(9) + 1, i * 2 + 2);
            System.out.printf(" %d/%d ", drob[i].p, drob[i].q);
            if (drob[i].q > max) max = drob[i].q;
        }    
        System.out.println();
        
        //Calculations Common denominator
        boolean getResult = false;
        int count = max - 1;
        //Calculations
        while (getResult == false)
        {
            count++;
            getResult = true;
            for (i = 0; i < n; i++)
                if (count % drob[i].q != 0)
                   getResult = false;
        }
        System.out.println("Common denominator = " + count);
        
         //Calculations Common denominator
        for (i = 0; i < n; i++)
        { 
            drob[i].p = count / drob[i].q * drob[i].p;
            drob[i].q = count;
        }  
               
        //Calculations Sort array
        int minValue;
        int min;
        int tmpP;
        for (i = 0; i < n - 1; i++)
        { 
            min = i;
            minValue = drob[i].p;
            for (int a = i + 1; a < n; a++)
                if (drob[a].p < minValue)
                {
                    min = a;
                    minValue = drob[a].p;
                }
            tmpP = drob[i].p;
            drob[i].p = drob[min].p;
            drob[min].p = tmpP;
        }
        
        //Output
        System.out.println("Output:");
        for (i = 0; i < n; i++)
        {
            System.out.printf(" %d/%d ", drob[i].p, drob[i].q);
        }    
        System.out.println();

    }
    
    public static class Drob 
    {
        public int p;
        public int q;
        
        public Drob(int pP, int pQ)
        {
            p = pP;
            q = pQ;
        }
    
    }
    
}
