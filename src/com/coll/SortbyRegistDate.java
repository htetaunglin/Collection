package com.coll;

import java.util.Comparator;

public class SortbyRegistDate implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getRegistDate().compareTo(o2.getRegistDate());
	}

}
