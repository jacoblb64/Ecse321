package A4;

import java.util.HashSet;

/**
 * Class to answer question 2 of assignment 4:
 * On Javadoc and comments
 * 
 * @author jbarne13
 *
 */
public class Q2 {

	/**
	 * Finds all of the unpaired (i.e. unique) numbers in an Integer array
	 * 
	 * @param numbers Given array of numbers to select from
	 * @return Array of only unpaired numbers
	 * 
	 * @throws IllegalArgumentException When the input is null
	 */
	public static Integer[] findUnpairedNumbers(Integer[] numbers) throws IllegalArgumentException {
		
		// Invalid input -- throw an Illegal Argument Exception
		if (numbers == null)
			throw new IllegalArgumentException();
		
		// using a hash set to ensure uniqueness
		HashSet<Integer> result = new HashSet<Integer>();
		
		for (int next: numbers) {
			if (result.contains(next)) { // check if this number has already been seen
				result.remove(next); // if so, remove it
			}
			else {
				result.add(next); // otherwise, it's good to keep
			}
		}
		// save the final results in a new array
		return result.toArray(new Integer[result.size()]);
	}
	
	/**
	 * Main method for testing
	 * 
	 * @param args Command line inputs, none expected
	 */
	public static void main(String[] args) {
		Integer[] testnums = {5, 3, 7, 5, 9};
		
		Integer[] unpairednums = findUnpairedNumbers(testnums);
		
		System.out.println(printIntegerArray(unpairednums));
	}
	
	/**
	 * Method to convert an Integer array to a string for printing
	 * Used in testing
	 * 
	 * @param array Integer array to be converted
	 * @return String representation of the array
	 * 
	 * @throws IllegalArgumentException When the input is null
	 */
	public static String printIntegerArray(Integer[] array) throws IllegalArgumentException {
		if (array == null)
			throw new IllegalArgumentException();
		String result = "";
		for (int next: array) {
			result += next + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;
	}
}
