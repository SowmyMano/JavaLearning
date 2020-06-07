package javalearning;

import java.util.ArrayList;
import java.util.List;

public class TC008_DuplicateValues {

	public static void main(String[] args) {
		String input = "When life gives you lemons, make lemonade";
		char[] charArray = input.toCharArray();
		List<Character> alpha = new ArrayList<Character>();
		
		for (char c : charArray) {
			if(!alpha.contains(c)) {
				alpha.add(c);
			} else
				System.out.print(c+",");
		}
	}
}