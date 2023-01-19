package com.udemyCourse.simpleAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retrieveCurrencyService(){
		return currencyServiceConfiguration;
	}

}
