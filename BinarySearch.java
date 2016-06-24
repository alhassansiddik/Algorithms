// Returns a string representation of value(s) if value is found.
// Else it returns a blank string if nothing is found
public class BinarySearch {
	
	public static String search(int[] array, int searchValue) {
		int minIndex = 0;
		int maxIndex = array.length - 1;
		String values = "";
		
		while(minIndex <= maxIndex) {
			int midIndex = (minIndex + maxIndex) / 2;
			if(array[midIndex] < searchValue) {
				minIndex = midIndex + 1;
			} else if(array[midIndex] > searchValue) {
				maxIndex = midIndex - 1;
			} else {
				values += searchValue;
				break;
			}
		}
		return values;
	}
	
	public static void main(String[] args) {
		int[] testArray = {0, 2, 4, 6, 8};
		String result = search(testArray, 4);
		System.out.println(result);
	}

}
