package javalearning;

public class TC001_Occurence_Approach3 {

	public static void main(String[] args) {
		String input = "You have no choice other than following me!";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)=='o') {
				count = count+1;
			}
		}
		System.out.println("Occurrence of 'o' is: "+count);	
			}
}
