package A4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class Q2Test {
	
	@Test
	public void testRemoveOne() {
		Integer[] input = 	{5, 3, 7, 5, 9};
		Integer[] output =	{3, 7, 9};
		
		assertEquals(true, testSet(input, output));
	}
	
	@Test
	public void testDidNotRemove() {
		Integer[] input =	{1, 2, 3, 4, 1};
		Integer[] output = 	{1, 2, 3, 4};
		
		assertEquals(false, testSet(input, output));
	}
	
	@Test
	public void testRemovedTooMuch() {
		Integer[] input = 	{1, 2, 3, 4, 1};
		Integer[] output =	{1, 2, 3};
		
		assertEquals(false, testSet(input, output));
	}
	
	@Test
	public void testIdentical() {
		Integer[] input = 	{1, 2, 3, 4};
		Integer[] output =	{1, 2, 3, 4};
		
		assertEquals(true, testSet(input, output));
	}
	
	@Test
	public void testEmpty() {
		Integer[] input = 	{};
		Integer[] output =	{};
		
		assertEquals(true, testSet(input, output));
	}
	
	@Test
	public void testNull() {
		Integer[] input = 	null;
		Integer[] output =	null;
		
		assertEquals(false, testSet(input, output));
	}
	
	@Test
	public void testLong() {
		Integer[] input = 	new Integer[10100];
		Integer[] output =	new Integer[10000];
		
		int i;
		for (i = 0; i < 10000; i++) {
			input[i] = i;
			output[i] = i;
		}
		
		// add 50 pairs of identical elements
		for (int k = 0; k < 2; k++) {
			for (int j = 0; j < 50; j++) {
				input[i] = 10000 + j;
				i++;
			}
		}

		assertEquals(true, testSet(input, output));
	}
	
	@Test
	public void testNegative() {
		Integer[] input =	{-1, -2, -3, -5, 1, 3, 4, -1};
		Integer[] output =	{	 -2, -3, -5, 1, 3, 4};
		
		assertEquals(true, testSet(input, output));
	}
	
	/**
	 * Tests findUnpairedNumbers on a given set
	 * 
	 * @param input Vector to test on
	 * @param testOutput Vector to match with
	 * 
	 * @return Whether output of the function matches the given output vector
	 */
	public Boolean testSet(Integer[] input, Integer[] testOutput) {
		try {
			Integer[] functionOutput = Q2.findUnpairedNumbers(input);
			
			// assuming correct testOutput given with unique values
			HashSet<Integer> corrSet = new HashSet<Integer>(Arrays.asList(testOutput));
			
			if (testOutput.length == functionOutput.length) { // check if same length
				for (int i = 0; i < functionOutput.length; i++) {
					
					// for each correct element, check that the output has exactly one match
					// this accounts for correct, but out of order output
					if (corrSet.contains(functionOutput[i])) {
						corrSet.remove(functionOutput[i]);
					}
					else {
						// if any element is not found, then not a match
						return false;
					}
				}
			} else {
				return false;
			}
			
		} catch (Exception e) {
			// Something went wrong
			return false;			
		}
		// all conditions were met
		return true;
	}

}
