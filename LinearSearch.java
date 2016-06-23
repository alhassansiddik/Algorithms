// Returns a string representation of value(s) if value is found.
public class LinearSearch {
	
	public static String values = "";
	
	public static String search(int[] array, int searchValue) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == searchValue) {
				values += searchValue;
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
