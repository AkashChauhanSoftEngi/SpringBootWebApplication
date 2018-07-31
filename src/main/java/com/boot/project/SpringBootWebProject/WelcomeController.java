package com.boot.project.SpringBootWebProject;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@Value("${welcome.message:test}")
	private String message;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model){
		model.put("message", this.message);
		return "welcome";
	}
	
}
