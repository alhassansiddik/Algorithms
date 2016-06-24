// takes an array as input and returns a sorted array using insertion sort algorithm
public class InsertionSort {
	public static int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			int insert = array[i];
			while((j > 0) && (array[j - 1] > insert)){
				array[j] = array[j - 1];
				j--;
			}
			array[j] = insert;
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
