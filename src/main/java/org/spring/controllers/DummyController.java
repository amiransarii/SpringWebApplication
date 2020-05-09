package org.spring.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DummyController {
	
	
	 //dummy test
	@RequestMapping("/first")
	public String display() {
	return "dummy1";
	}
	//redirect to second page
	 @RequestMapping("/second")
	public String secondPage() {
		return "secondpage";
	}
	
	
}
