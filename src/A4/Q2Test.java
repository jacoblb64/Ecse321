package A4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q2Test {
	
	@Test
	public void test() {
		Integer[] testnums = {5, 3, 7, 5, 9};
		
		Integer[] unpairednums = Q2.findUnpairedNumbers(testnums);
		
		Integer[] correct = {3, 7, 9};
		
		// check the lengths are the same
		assertEquals(correct.length, unpairednums.length);
		
		// check all elements match
		for (int i = 0; i < unpairednums.length; i++) {
			assertEquals(correct[i], unpairednums[i]);
		}
	}

}
