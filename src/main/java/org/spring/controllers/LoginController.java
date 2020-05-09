package org.spring.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	/**
	 * 
	 The HttpServletRequest is used to read the HTML form data provided by the user.
    The Model contains the request data and provides it to view page.
	 */
	
	@RequestMapping("/login")
	public String display(HttpServletRequest req,Model m)  {
		
		 //read the provided form data  
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(pass.equals("admin")) {
			
			String msg = "Hello "+name;
			 //add a message to the model  
			m.addAttribute("message",msg);
			
			return "loginsucess";
			
		}
		else {
			
			String msg = "Sorry "+ name+". You entered an incorrect password";  
			m.addAttribute("message",msg);
			 return "errorpage";
		}
		
	}

}
