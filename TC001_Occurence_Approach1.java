package javalearning;

public class TC001_Occurence_Approach1 {

	public static void main(String[] args) {
		//Provide input string
		String input = "You have no choice other than following me!";
				
		//Declare count
		int count = 0;
			
		//Convert to character array
		char[] charArray = input.toCharArray();
				
		//Logic: Iterate each element of array, check if it is 'o', add to count
		for (char c : charArray) {
			if(c=='o') {
				count = count+1;
			}
		}	
		System.out.println("Occurrence of 'o' is: "+count);	
			}
}
