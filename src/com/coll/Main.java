package com.coll;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Account> accList = new ArrayList<>();

		Collections.addAll(accList, new Account("min@gmail.com", false, LocalDate.of(2019, 5, 1), "Min Min"),
				new Account("kyaw@gmail.com", false, LocalDate.of(2019, 6, 14), "Kyaw Kyaw"),
				new Account("maung@gmail.com", false, LocalDate.of(2019, 8, 21), "Maung Maung"));

		Collections.sort(accList);
		for (Account a : accList) {
			System.out.println(a);
			System.out.println();
		}
	}
}
