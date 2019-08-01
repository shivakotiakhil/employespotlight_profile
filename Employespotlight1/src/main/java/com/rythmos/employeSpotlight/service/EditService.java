package com.rythmos.employeSpotlight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rythmos.employeSpotlight.dao.EditDao;
import com.rythmos.employeSpotlight.request.EditJSONRequest;

@Service
public class EditService {
	@Autowired
	EditDao editDao;
	
	public ResponseEntity<?>  editUser(EditJSONRequest editJSONRequest) {
		System.out.println("service");
		return editDao.editUser(editJSONRequest);
	}
	
}
