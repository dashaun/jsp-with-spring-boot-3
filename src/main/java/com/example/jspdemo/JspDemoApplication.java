package com.example.jspdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspDemoApplication.class, args);
	}

}

@Controller
class HelloController {
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
}
