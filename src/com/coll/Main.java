package com.coll;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Account> accList = new ArrayList<>();

		Collections.addAll(accList, new Account("min@gmail.com", false, LocalDate.of(2019, 5, 1), "Min Min", 30),
				new Account("kyaw@gmail.com", true, LocalDate.of(2019, 6, 14), "Kyaw Kyaw", 23),
				new Account("maung@gmail.com", false, LocalDate.of(2019, 8, 21), "Maung Maung", 56),
				new Account("maung@gmail.com", true, LocalDate.of(2019, 8, 21), "Su Su", 49));

		Collections.sort(accList);

		showAccounts(accList, "Sort by Natural Ordering : ");

		Comparator<Account> byName = new Comparator<Account>() {

			@Override
			public int compare(Account o1, Account o2) {
				return o2.getAge() - o1.getAge();
			}
		};

		System.out.println();
		System.out.println();
		System.out.println();
		Collections.sort(accList, byName);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		showAccounts(accList, "Sort by Age : ");

		Collections.sort(accList, new SortbyRegistDate());
	}

	private static void showAccounts(List<Account> accList, String show) {
		System.out.println(show);
		for (Account a : accList) {
			System.out.println(a);
			System.out.println();
		}
	}

}
