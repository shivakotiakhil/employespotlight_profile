package com.rythmos.employeSpotlight.home.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rythmos.employeSpotlight.home.Home;

@Service
public class HomeService {

	 List<Home> home= Arrays.asList(
			new Home("rythmos420","akhil","a@gmail.com","akhil"),
			new Home("rythmos420","akhil","a@gmail.com","akhil")
			);
	 public List<Home> elements()
	 {
		 return home;
	 }
	public void add(Home home) {
		// TODO Auto-generated method stub
		Home.add(home);
	}
	 
	 
	
	

}

