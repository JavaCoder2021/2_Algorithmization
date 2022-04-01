/*
 * 5.
 * Сортировка вставками. Дана последовательность чисел 
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом. 
 * Пусть - упорядоченная последовательность, т.  е. . Берется следующее число и вставляется в последовательность так,  
 * чтобы новая последовательность была тоже возрастающей. 
 * Процесс производится до тех пор, пока все элементы от  i +1 до n не будут перебраны. 
 * Примечание. Место помещения очередного элемента в отсортированную часть производить 
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
package by.epam.algorithmization.sort;

public class Task5 {
	
	public static void main(String[] args) throws Exception {
		
		int[] myArray = new int[10];
		int index, tmp, i, j;

		for (i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 10);
			System.out.print(" " + myArray[i] + " ");
		}
		System.out.println();

		for (i = 1; i < myArray.length; i++) {
			
			index = binarySearch(0, i - 1, myArray, myArray[i]);
			
			if (index != i) {
				
				tmp = myArray[i];
				
				for (j = i - 1; j >= index; j--)
					myArray[j + 1] = myArray[j];
					
				myArray[index] = tmp;
				
			}
			
		}
		
		for (i = 0; i < myArray.length; i++)
			System.out.print(" " + myArray[i] + " ");
				
	}	
	
	public static int binarySearch(int from, int to, int array[], int elementToSearch) {

	    while (from <= to) {
	    	
	        int middleIndex = (from + to) / 2;

	        if (array[middleIndex] == elementToSearch) {
	            return middleIndex;
	        }

	        else if (array[middleIndex] < elementToSearch)
	        	from = middleIndex + 1;

	        else if (array[middleIndex] > elementToSearch)
	        	to = middleIndex - 1;

	    }
	    
	    return to + 1;
	    
	}

}
