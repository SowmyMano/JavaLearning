package javalearning;

public class TC004_StringReversal_Approach1 {

	public static void main(String[] args) {
		//Provide input string
		String input = "When the world realise its own mistake, corona will dissolve automatically";
		String[] strings = input.split("\\s");
		
		for (int i=0; i<strings.length; i++) {
			if(i%2!=0) {
				StringBuffer buffer = new StringBuffer(strings[i]);
				buffer.reverse();
				System.out.print(buffer);
			} else {
				System.out.print(strings[i]);
			}
			System.out.print(" ");
		}
	}
}
