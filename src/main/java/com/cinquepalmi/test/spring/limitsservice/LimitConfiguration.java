package com.cinquepalmi.test.spring.limitsservice;

public class LimitConfiguration {

	private Long minimum;
	private Long maximum;
	
	public LimitConfiguration() {}
	
	public LimitConfiguration(Long minimum, Long maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public Long getMinimum() {
		return minimum;
	}
	public void setMinimum(Long minimum) {
		this.minimum = minimum;
	}
	public Long getMaximum() {
		return maximum;
	}
	public void setMaximum(Long maximum) {
		this.maximum = maximum;
	}
	
}