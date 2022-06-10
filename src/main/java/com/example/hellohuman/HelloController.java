package com.example.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name,
			@RequestParam(value="last_name", required=false) String last_name,
			@RequestParam(value="times", required=false) Integer times) {
		if(name != null || last_name != null) {
			String output = "Hello";
			if(name != null) {
				output += " " + name;
			}
			if(last_name != null) {
				output += " " + last_name;
			}
			if(times != null) {	
				String tempt = "";
				for(int i = 0; i < times; i++) {
					tempt += output + " ";
				}
				output = tempt;
			}
			return output;
		}
		return "Hello Human";
	}
}
