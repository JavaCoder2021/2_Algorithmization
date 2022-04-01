/*
 * 6. 
 * Сортировка Шелла.
 * Дан массив n действительных чисел. 
 * Требуется упорядочить его по возрастанию. 
 * Делается это следующим образом: сравниваются два соседних элемента 
 */
package by.epam.algorithmization.sort;

public class Task6 {

	public static void main(String[] args) {

		double[] myArray = new double[10];
		int i, count = 0;
		double tmp = 0;

		for (i = 0; i < myArray.length; i++) {
			myArray[i] = Math.random() * 10;
			System.out.printf(" %.1f ", myArray[i]);
		}
		System.out.println();

		i = 0;
		while (i < myArray.length - 1) {
			if (myArray[i] <= myArray[i + 1]) {
				i++;
			} else {
				count = i;
				while (myArray[count] > myArray[count + 1]) {
					tmp = myArray[count];
					myArray[count] = myArray[count + 1];
					myArray[count + 1] = tmp;
					count--;
					if (count < 0)
						break;
				}
			}
		}

		for (i = 0; i < myArray.length; i++)
			System.out.printf(" %.1f ", myArray[i]);

	}

}
