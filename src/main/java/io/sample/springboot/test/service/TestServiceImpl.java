package io.sample.springboot.test.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

	private List<Test> tests = Arrays.asList(
			new Test("Java", "Java Test"),
			new Test("Spring", "Spring Test"),
			new Test("Android", "Android Test"));
		
	@Override
	public List<Test> getAllTest() {
		return tests;
	}

	@Override
	public Test getTest(String testName) {
		
		/** iterator 
		* 
		* new iterator introduce in java 8 
		* */	
		
		return tests.stream().filter(t -> t.getTestName().toLowerCase().equals(testName.toLowerCase())).findFirst().get();
	}

	
}
