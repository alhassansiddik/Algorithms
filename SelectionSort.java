// takes an array as input and returns a sorted array using selection sort algorithm
public class SelectionSort {
	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i; j < array.length; j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] testArray = {3, 7, 5, 9, 2};
		int[] sortedArray = sort(testArray);
		for (int i : sortedArray) {
			System.out.print(i);
		}
	}

}
