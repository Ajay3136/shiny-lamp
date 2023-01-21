package com.udemyCourse.simpleAPI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "application")
@Component
public class CurrencyServiceConfiguration {
	
	@Value("${currency-service.url}")
	private String url;
	
	@Value("${currency-service.username}")
	private String username;
	
	@Value("${currency-service.key}")
	private String key;
	
	@Value("${myapp.property1}")
	private String property1;
	
	public String getProperty1() {
		return property1;
	}
	public void setProperty1(String property1) {
		this.property1 = property1;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
