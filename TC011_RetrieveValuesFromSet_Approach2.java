package javalearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TC011_RetrieveValuesFromSet_Approach2 {

	public static void main(String[] args) {
		//Set = "1,2,3,4,5,6,7,8,9"
		//retrieve and print only the value - 7
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		
		List<Integer> numList = new ArrayList<Integer>(numbers);
		System.out.println(numList.get(6));
	}
}