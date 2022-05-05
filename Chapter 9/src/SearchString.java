/*
 * Search.java
 */
 
 public class SearchString extends FindName
 {
	/**
	 * Returns the index of the element numToFind in array array.
	 * -1 returned if element not found.
	 * pre: none
	 * post: index of numToFind has been returned. -1 has been
	 * returned if element not found.
	 */
	 public static int linear(String[] array, String wordToFind) {
		int index = 0;
		
		while (!(array[index].equals(wordToFind)) && (index < array.length - 1)) {
			index += 1;
		}
		
		if (array[index].equals(wordToFind)) 
		{
			return(index);
		} else {
			return(-1);
		}
	}
}