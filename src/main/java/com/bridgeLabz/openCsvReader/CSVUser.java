package com.bridgeLabz.openCsvReader;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {
	
	@CsvBindByName
	private String name;
	
	@CsvBindByName
	private String email;
	
	@CsvBindByName
	private String phone;

	@Override
	public String toString() {
		return "CSVUser [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

	public CSVUser(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	
}
