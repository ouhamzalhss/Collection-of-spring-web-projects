package com.ouhamza.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	
	private String firstName;
	@NotNull(message="is requierd")
	@Size(min=1)
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLang;
	private String[] os;
	
	
	public Student() {
		super();
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brasil");
		countryOptions.put("EGY", "Egypt");
		countryOptions.put("MAR", "Maroc");
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


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getFavoriteLang() {
		return favoriteLang;
	}


	public void setFavoriteLang(String favoriteLang) {
		this.favoriteLang = favoriteLang;
	}


	public String[] getOs() {
		return os;
	}


	public void setOs(String[] os) {
		this.os = os;
	}
	
	
}
