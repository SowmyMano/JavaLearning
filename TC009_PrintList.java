package javalearning;

import java.util.ArrayList;
import java.util.List;

public class TC009_PrintList {

	public static void main(String[] args) {
		String input = "Bugatti Chiron";
		List<Character> letters = new ArrayList<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			letters.add(input.charAt(i));
		}
		
		for (Character character : letters) {
			System.out.println(character);
		}
		}		
}