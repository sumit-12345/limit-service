package com.in28minutes.microservice.limitservice.component;

import org.springframework.boot.context.properties.ConfigurationProperties;

@org.springframework.stereotype.Component
@ConfigurationProperties("limit-service")
public class Configuration {
	private long max,min;

	public long getMax() {
		return max;
	}

	public void setMax(long max) {
		this.max = max;
	}

	public long getMin() {
		return min;
	}

	public void setMin(long min) {
		this.min = min;
	}

	public Configuration(long max, long min) {
		super();
		this.max = max;
		this.min = min;
	}

	public Configuration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
