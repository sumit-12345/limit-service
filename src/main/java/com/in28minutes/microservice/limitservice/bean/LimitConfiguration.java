package com.in28minutes.microservice.limitservice.bean;

public class LimitConfiguration {
	private long maximum,minimum;

	public LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LimitConfiguration(long maximum, long minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public long getMaximum() {
		return maximum;
	}

	public void setMaximum(long maximum) {
		this.maximum = maximum;
	}

	public long getMinimum() {
		return minimum;
	}

	public void setMinimum(long minimum) {
		this.minimum = minimum;
	}
	
	
}
