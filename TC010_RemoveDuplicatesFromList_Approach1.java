package javalearning;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TC010_RemoveDuplicatesFromList_Approach1 {

	public static void main(String[] args) {
		List<String> input = new ArrayList<String>();
		input.add("A");
		input.add("B");
		input.add("C");
		input.add("D");
		input.add("A");
		input.add("D");
		input.add("E");
		input.add("F");
		
		Set<String> uniqueSet = new LinkedHashSet<String>(input);
		System.out.println("After removing duplicates: "+uniqueSet);
	}
}