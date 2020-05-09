package org.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author amir.ansari
 *In Spring MVC, the @RequestParam annotation is used to read the form data and bind it automatically 
 *to the parameter present in the provided method. So, it ignores the requirement of HttpServletRequest 
 *object to read the provided data.
 *The @RequestParam is used to read the HTML form data provided by a user and bind it to the request parameter.
 */
@Controller
public class LoginController2 {
	
	@RequestMapping("/login2")
	public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m) {
		
		if(pass.equals("admin")) {
			String msg="Hello "+ name;  
			//add a message to the model  
			m.addAttribute("message",msg);
			return "loginsucess";
		}
		else {
			  String msg="Sorry "+ name+". You entered an incorrect password";  
	            m.addAttribute("message", msg);  
	            return "errorpage";  
		}
		
	}

}
