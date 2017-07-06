package io.sample.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.sample.springboot.test.service.Test;
import io.sample.springboot.test.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value= "/getAllTest",method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Test>> getAllTest() {
		return ResponseEntity.ok().body(testService.getAllTest());
	}
	
	@RequestMapping(value= "/getTest/{testName}",method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<Test> getTest(@PathVariable String testName) {
		return ResponseEntity.ok().body(testService.getTest(testName));
	}
}
