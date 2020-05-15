package javalearning;

public class TC002_Palindrome_Approach1 {

	public static void main(String[] args) {
		String input = "malayalam";
		StringBuffer original = new StringBuffer(input);
		System.out.println(original);
		StringBuffer reverse = original.reverse();
		System.out.println(reverse);
		
		if(reverse.toString().equals(input)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not a Palindrome");
			}
}
