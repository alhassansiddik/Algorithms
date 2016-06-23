// takes an array as input and returns a sorted array using bubble sort algorithm
public class BubbleSort {
	public static int[] sort(int[] array) {
		for (int i = array.length - 1; i > 0;  i--) {
			for (int j = 0; j < i; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}d
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
