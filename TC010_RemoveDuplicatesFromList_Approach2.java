package javalearning;

import java.util.ArrayList;
import java.util.List;

public class TC010_RemoveDuplicatesFromList_Approach2 {

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
		
		List<String> uniqueList = new ArrayList<String>();
		for (String string : input) {
			if(!uniqueList.contains(string)) {
				uniqueList.add(string);
			}
		}
		System.out.println("After removing duplicates: "+uniqueList);
	}
}