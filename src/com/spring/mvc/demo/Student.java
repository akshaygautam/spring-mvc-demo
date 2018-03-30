package com.spring.mvc.demo;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String>countryOptions;
	private String language;
	private String[] os;
	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("Ind", "India");
		countryOptions.put("De", "Germany");
		countryOptions.put("Fr", "France");
		countryOptions.put("Usa", "America");
		countryOptions.put("Br", "Brazil");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
