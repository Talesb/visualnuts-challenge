package br.com.talesb.visualnuts.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Exercise2 {

	public static void main(String[] args) {

		List<CountryLangDTO> countrySample = new ArrayList<>();

		CountryLangDTO us = new CountryLangDTO("US", Arrays.asList("en"));
		CountryLangDTO be = new CountryLangDTO("BE", Arrays.asList("de", "nl", "fr"));
		CountryLangDTO nl = new CountryLangDTO("NL", Arrays.asList("nl", "fy"));
		CountryLangDTO de = new CountryLangDTO("DE", Arrays.asList("de"));
		CountryLangDTO es = new CountryLangDTO("ES", Arrays.asList("es"));
		CountryLangDTO pt = new CountryLangDTO("PT", Arrays.asList("pt"));
		countrySample.addAll(Arrays.asList(us,be,nl,de,es,pt));
		
		doProcessCountries(countrySample);

	}

	public static CountriesResponseDTO doProcessCountries(List<CountryLangDTO> countrySample) {
		int numberOfCountries;
		CountryLangDTO mostOficialLanguagesGerman = new CountryLangDTO();
		Set<String> allOfficialLanguages = new HashSet<>();
		CountryLangDTO highestNumberOfOfficialLanguages = new CountryLangDTO();
		Map<String, Integer> langNdTimesRepeated = new HashMap<>();
		AtomicReference<String> mostCommonOfficialLanguage = new AtomicReference<>();
		
		// Returns the number of countries in the world
		numberOfCountries = countrySample.size();

		for (CountryLangDTO country : countrySample) {

			List<String> currentCountryLangs = country.getLanguages();

			boolean isDe = currentCountryLangs.stream().anyMatch(lang -> "de".equals(lang));

			// Finds the country with the most official languages, where they officially
			// speak German (de).
			if (isDe) {
				if (mostOficialLanguagesGerman.getLanguages() == null) {
					mostOficialLanguagesGerman = country;
				} else if (mostOficialLanguagesGerman.getLanguages().size() < currentCountryLangs.size()) {
					mostOficialLanguagesGerman = country;
				}
			}

			System.out.println(country);
			
			// Finds the country with the highest number of official languages.
			if (highestNumberOfOfficialLanguages.getLanguages() == null) {
				highestNumberOfOfficialLanguages = country;
			} else if (highestNumberOfOfficialLanguages.getLanguages().size() < currentCountryLangs.size()) {
				highestNumberOfOfficialLanguages = country;
			}

			// Finds all the official languages spoken in the listed countries
			allOfficialLanguages.addAll(country.getLanguages());

			// Finds the most common official language(s), of all countries.
			country.getLanguages().forEach(lang -> {
				if (langNdTimesRepeated.containsKey(lang)) {
					langNdTimesRepeated.put(lang, langNdTimesRepeated.get(lang) + 1);
				} else {
					langNdTimesRepeated.put(lang, 1);
				}
			});
			
		
			AtomicInteger mostCommonOfficialLanguageIndexQtd = new AtomicInteger(0);
		
			
			langNdTimesRepeated.forEach((key,value)->{
				if(value>mostCommonOfficialLanguageIndexQtd.get()) {
					mostCommonOfficialLanguage.set(key);
					mostCommonOfficialLanguageIndexQtd.set(value);
				}
			});
		}

		
		CountriesResponseDTO resp = new CountriesResponseDTO();
		resp.setNumberOfCountries(numberOfCountries);
		resp.setAllOfficialLanguages(allOfficialLanguages);
		resp.setMostCommonOfficialLanguage(mostCommonOfficialLanguage.get());
		resp.setMostOficialLanguagesGerman(mostOficialLanguagesGerman);
		resp.setHighestNumberOfOfficialLanguages(highestNumberOfOfficialLanguages);
		
		System.out.println("Number of Countries in the World: " + numberOfCountries);
		System.out.println("The country with the most official languages, where they officially speak German (de): "
				+ mostOficialLanguagesGerman.toString());
		System.out.println("All the official languages spoken in the listed countries :");
		allOfficialLanguages.forEach(lang -> System.out.println(lang));
		System.out.println("-----------------------------------------------------------");
		System.out.println("The country with highest number of official languages: "
				+ highestNumberOfOfficialLanguages.toString());
		System.out.println("The most common official language(s), of all countries: "+mostCommonOfficialLanguage.get());

		
		return resp;
		
	}

}
