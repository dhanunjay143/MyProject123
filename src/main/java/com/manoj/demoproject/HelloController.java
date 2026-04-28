package com.manoj.demoproject;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	
	@GetMapping("/")
	public String home()
	{
		return "helloworld this is spring boot...";
	}
}
