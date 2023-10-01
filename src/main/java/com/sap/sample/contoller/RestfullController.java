package com.sap.sample.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.sample.service.DestinationService;

@RestController
public class RestfullController {
	
	@Autowired
	DestinationService service;

	@GetMapping("/destination")
	public String getMethod() {
		return service.getBusinessPartner();
	}
}
