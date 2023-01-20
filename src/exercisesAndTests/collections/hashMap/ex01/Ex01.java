package exercisesAndTests.collections.hashMap.ex01;

import java.util.HashMap;
import java.util.Map;

public class Ex01 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to associate the specified value with the specified key in a HashMap.
		 */
		
		HashMap<Integer, String> keyValue = new HashMap<>();
		keyValue.put(1, "Red");
		keyValue.put(2, "Green");
		keyValue.put(3, "Blue");
		keyValue.put(4, "White");
		keyValue.put(5, "Black");
		
		System.out.println(keyValue);
		
		for (Map.Entry key : keyValue.entrySet()) {
			System.out.println(key.getKey() + " " + key.getValue());
		}
	}

}
