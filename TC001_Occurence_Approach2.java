package javalearning;

public class TC001_Occurence_Approach2 {

	public static void main(String[] args) {
		String input = "You have no choice other than following me!";
		input = input.replaceAll("[^o]", "");
		System.out.println("Occurrence of 'o' is: "+input.length());	
			}
}
