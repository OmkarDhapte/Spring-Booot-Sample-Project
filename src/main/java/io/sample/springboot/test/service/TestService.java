package io.sample.springboot.test.service;

import java.util.List;

public interface TestService {

	public List<Test> getAllTest();
	public Test getTest(String testName);
}
