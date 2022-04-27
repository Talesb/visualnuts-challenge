package br.com.talesb.visualnuts.exercise2;

import java.util.Set;

public class CountriesResponseDTO {
	private int numberOfCountries;
	private CountryLangDTO mostOficialLanguagesGerman;
	private Set<String> allOfficialLanguages;
	private CountryLangDTO highestNumberOfOfficialLanguages;
	private String mostCommonOfficialLanguage;

	public int getNumberOfCountries() {
		return numberOfCountries;
	}

	public void setNumberOfCountries(int numberOfCountries) {
		this.numberOfCountries = numberOfCountries;
	}

	public CountryLangDTO getMostOficialLanguagesGerman() {
		return mostOficialLanguagesGerman;
	}

	public void setMostOficialLanguagesGerman(CountryLangDTO mostOficialLanguagesGerman) {
		this.mostOficialLanguagesGerman = mostOficialLanguagesGerman;
	}

	public Set<String> getAllOfficialLanguages() {
		return allOfficialLanguages;
	}

	public void setAllOfficialLanguages(Set<String> allOfficialLanguages) {
		this.allOfficialLanguages = allOfficialLanguages;
	}

	public CountryLangDTO getHighestNumberOfOfficialLanguages() {
		return highestNumberOfOfficialLanguages;
	}

	public void setHighestNumberOfOfficialLanguages(CountryLangDTO highestNumberOfOfficialLanguages) {
		this.highestNumberOfOfficialLanguages = highestNumberOfOfficialLanguages;
	}

 

	public String getMostCommonOfficialLanguage() {
		return mostCommonOfficialLanguage;
	}

	public void setMostCommonOfficialLanguage(String mostCommonOfficialLanguage) {
		this.mostCommonOfficialLanguage = mostCommonOfficialLanguage;
	}

}
