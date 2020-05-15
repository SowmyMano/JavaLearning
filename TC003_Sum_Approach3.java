package javalearning;

public class TC003_Sum_Approach3 {

	public static void main(String[] args) {
		String input = "asdf1qwer9as8d7";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				sum = sum + Integer.parseInt(String.valueOf(input.charAt(i)));
			}
		}
		System.out.println("Sum of numbers: "+sum);	
			}
}
