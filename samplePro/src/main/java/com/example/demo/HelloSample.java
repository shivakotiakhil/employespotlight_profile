package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSample {
	@RequestMapping("/getMessage")
	public ResponseEntity<String> message(){
		System.out.println("Testing...............");
		return new ResponseEntity<String>("hi",HttpStatus.OK);

}
}