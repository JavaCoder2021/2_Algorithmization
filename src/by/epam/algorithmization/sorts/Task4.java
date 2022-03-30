/*
 * 4. 
 * Сортировка обменами. Дана последовательность чисел.
 * Требуется переставить числа в порядке возрастания.  
 * Для этого сравниваются два соседних числа. Если , то делается перестановка. 
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок. 
 */
package by.epam.algorithmization.sort;

public class Task4 {
    
    public static void main(String[] args) {
    	       
        int[] myArray = new int[10];
        int tmp, i, j;
        boolean swap;
        
        for (i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
            System.out.print(" " + myArray[i] + " ");
        }
        System.out.println();
        
        for (i = myArray.length - 1; i > 0; i--) {
            swap = false;
            for (j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    tmp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tmp;     
                    swap = true;
                }
            }
            if (!swap) break;
        }
        
        for (i = 0; i < myArray.length; i++)
            System.out.print(" " + myArray[i] + " ");

    }
    
}
