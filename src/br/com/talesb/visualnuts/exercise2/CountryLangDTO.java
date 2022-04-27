package br.com.talesb.visualnuts.exercise2;

import java.util.List;

public class CountryLangDTO {

	public String country;
	public List<String> languages;
	
	

	public CountryLangDTO() {
		super();
	}

	public CountryLangDTO(String country, List<String> languages) {
		super();
		this.country = country;
		this.languages = languages;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "CountryLangDTO [country=" + country + ", languages=" + languages + "]";
	}

	
	
	
}
