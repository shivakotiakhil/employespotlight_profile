package com.rythmos.employeSpotlight.HomeController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rythmos.employeSpotlight.home.Home;
import com.rythmos.employeSpotlight.home.service.HomeService;

@RestController
public class Homecontroller {
	@Autowired
	private HomeService homeService;
	@RequestMapping("/hello")
	private List<Home> msg()
	{
	
	return homeService.elements();
    }

	   @RequestMapping(value = "/hello", method=RequestMethod.POST)
	 public void add(@RequestBody Home home) {
		   homeService.add(home);
	   }
}
    
	
