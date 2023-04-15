package com.preethi.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ppattabiraman URL : /currency-configuration return : the properties configured in CurrencyServiceConfiguration
 *
 */
@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;

	@GetMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses() {
		return currencyServiceConfiguration;
	}
}
