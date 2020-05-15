package javalearning;

public class TC005_CharSplit_Approach2 {

	public static void main(String[] args) {
		String input = "1. It is Work from Home  not Work for Home";
		int upper = 0, lower = 0, numbers = 0, spaces = 0;
		for (int i = 0; i < input.length(); i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				upper++;
			} else if (Character.isLowerCase(input.charAt(i))) {
				lower++;
			} else if (Character.isDigit(input.charAt(i))) {
				numbers++;
			} else if (Character.isWhitespace(input.charAt(i))) {
				spaces++;
			}
		}
		System.out.println("Upper Case: "+upper);
		System.out.println("Lower Case: "+lower);
		System.out.println("Numbers: "+numbers);
		System.out.println("Spaces: "+spaces);
			}
}
