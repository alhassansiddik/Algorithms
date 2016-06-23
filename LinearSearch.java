// Returns a string representation of value(s) if value is found.
// Else it returns a blank string if nothing is found
public class LinearSearch {
	
	public static String search(int[] array, int searchValue) {
		String values = "";
		for(int i = 0; i < array.length; i++) {
			if(array[i] == searchValue) {
				values += searchValue;
			}else {
			}
		}
		return values;
	}
	
	public static void main(String[] args) {
		int[] testArray = {0, 2, 4, 6, 8};
		String result = search(testArray, 5);
		System.out.println(result);
	}
}
