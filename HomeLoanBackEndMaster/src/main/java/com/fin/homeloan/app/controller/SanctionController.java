package com.fin.homeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fin.homeloan.app.model.Sanction;
import com.fin.homeloan.app.servicei.SanctionService;

@RestController
public class SanctionController {
	
	@Autowired
	SanctionService service;
	
	@PostMapping("/saveSanction")
	public String saveSanction(@RequestBody Sanction s) {
		service.saveSanction(s);
		return "Done!!";
		
	}

}
