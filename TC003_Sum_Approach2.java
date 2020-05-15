package javalearning;

public class TC003_Sum_Approach2 {

	public static void main(String[] args) {
		String input = "asdf1qwer9as8d7";
		int sum = 0;
		input = input.replaceAll("[^0-9]", "");
		int number = Integer.parseInt(input);
		
		while(number!=0) {
			sum = sum + number%10;
			number = number/10;
		}
		System.out.println("Sum of numbers: "+sum);	
			}
}
