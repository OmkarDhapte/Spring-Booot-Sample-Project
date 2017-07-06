package io.sample.springboot.test.service;

public class Test {

	private String testName;
	private String testDescription;
	
	public Test(String testName, String desc) {
		this.testName = testName;
		this.testDescription = desc;
	}
	
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestDescription() {
		return testDescription;
	}
	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}
	
	
}
