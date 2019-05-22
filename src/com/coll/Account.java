package com.coll;

import java.time.LocalDate;

public class Account implements Comparable<Account> {
	private String email;
	private boolean active;
	private LocalDate registDate;
	private String name;

	public Account(String email, boolean active, LocalDate registDate, String name) {
		super();
		this.email = email;
		this.active = active;
		this.registDate = registDate;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDate getRegistDate() {
		return registDate;
	}

	public void setRegistDate(LocalDate registDate) {
		this.registDate = registDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Login ID : " + email + "\nName : " + name + "\nActive : " + active + "\nRegistered : " + registDate;
	}

	@Override
	public int compareTo(Account o) {
		return name.compareTo(o.name);
	}
}
