package br.com.talesb.visualnuts.exercise2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Exercise2Test {

	@Test
	public void doProcessCountriesTest() {

		List<CountryLangDTO> countrySample = new ArrayList<>();

		CountryLangDTO us = new CountryLangDTO("US", Arrays.asList("en"));
		CountryLangDTO be = new CountryLangDTO("BE", Arrays.asList("de", "nl", "fr"));
		CountryLangDTO nl = new CountryLangDTO("NL", Arrays.asList("nl", "fy"));
		CountryLangDTO de = new CountryLangDTO("DE", Arrays.asList("de"));
		CountryLangDTO es = new CountryLangDTO("ES", Arrays.asList("es"));
		CountryLangDTO pt = new CountryLangDTO("PT", Arrays.asList("pt"));
		countrySample.addAll(Arrays.asList(us,be,nl,de,es,pt));
		
		CountriesResponseDTO response = Exercise2.doProcessCountries(countrySample);
		
		 assertEquals(6,response.getNumberOfCountries());		
		 assertEquals("BE",response.getMostOficialLanguagesGerman().getCountry());		
		 assertEquals(7,response.getAllOfficialLanguages().size());		
		 assertEquals("BE",response.getHighestNumberOfOfficialLanguages().getCountry());	
		 assertEquals("de",response.getMostCommonOfficialLanguage());	
		 
	}
}
