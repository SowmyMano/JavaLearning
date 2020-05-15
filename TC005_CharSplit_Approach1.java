package javalearning;

public class TC005_CharSplit_Approach1 {

	public static void main(String[] args) {
		String input = "1. It is Work from Home  not Work for Home";
		System.out.println("Upper Case: "+input.replaceAll("[^A-Z]", "").length());
		System.out.println("Lower Case: "+input.replaceAll("[^a-z]", "").length());
		System.out.println("Numbers: "+input.replaceAll("[^0-9]", "").length());
		System.out.println("Spaces: "+input.replaceAll("[^\\s]", "").length());
			}
}
