package com.coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {
	public static void main(String[] args) {
		Map<String, Integer> fruits = new HashMap<String, Integer>();
		fruits.put("Orange", 600);
		fruits.put("Apple", 700);
		fruits.put("Mango", 800);
		fruits.put("Pine Apple", 2_000);
		fruits.put("Watermelon", 2200);

		fruits.put("Orange", 400);

		System.out.println("Available Fruits : " + fruits.size());

		Collection<Integer> prices = fruits.values();

		Set<String> keys = fruits.keySet();

		for (String fruitName : keys) {
			System.out.println(fruitName);
		}

		Set<Entry<String, Integer>> pairs = fruits.entrySet();

		for (Entry<String, Integer> entry : pairs) {
			System.out.println(entry.getKey() + " price : " + entry.getValue());
		}

	}
}
