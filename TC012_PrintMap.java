package javalearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TC012_PrintMap {

	public static void main(String[] args) {
		//Write a Java Program to print the keys and values from the Map
		//map = {A=1, B=2, C=3, D=4, E=5}
		//Output:
		//A->1
		//B->2
		//C->3
		//D->4
		//E->5
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);

		for (Entry<String, Integer> pair : map.entrySet()) {
			System.out.println(pair.getKey()+"->"+pair.getValue());
		}
	}
}