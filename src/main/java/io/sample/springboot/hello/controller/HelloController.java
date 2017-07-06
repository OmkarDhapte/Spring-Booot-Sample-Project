package io.sample.springboot.hello.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class HelloController {

	private Logger logger = (Logger) Logger.getInstance(HelloController.class);
	
	@RequestMapping(value= "/sayHello",method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<Map<String,Object>> sayHello() {
		
		Map<String, Object> response = new HashMap<>();
		response.put("name", "Omkar Dhapte");
		response.put("phoneNumber", "9860269569"); 
		logger.debug("response"+response.toString());
		return ResponseEntity.ok().body(response);
	}
}
