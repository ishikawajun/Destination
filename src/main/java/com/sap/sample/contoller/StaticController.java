package com.sap.sample.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {
	
	@GetMapping("/")
	public String index() throws Exception {
		return "/index.html";
	}
}
