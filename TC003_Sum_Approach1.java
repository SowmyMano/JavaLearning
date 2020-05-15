package javalearning;

public class TC003_Sum_Approach1 {

	public static void main(String[] args) {
		String input = "asdf1qwer9as8d7";
		int sum = 0;
		input = input.replaceAll("[^0-9]", "");
		for (int i = 0; i < input.length(); i++) {
			 int value = Integer.parseInt(String.valueOf(input.charAt(i)));
			 sum = sum+value;
		}
		System.out.println("Sum of numbers: "+sum);	
			}
}
