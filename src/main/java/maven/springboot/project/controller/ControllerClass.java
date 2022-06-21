package maven.springboot.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@RequestMapping("/Home")
	public String home() {
		return "Hello world";
	}
	
	@RequestMapping("/About")
	public String about() {
		return "About us";
	}
	
	
}
