package com.se.group2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Main tag to signal this class is the launching point of SpringBoot.
@SpringBootApplication
//Tag telling that this class is a controller, i.e. defines method that should be called upon HTTP requests.
@Controller
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping //Marks this method as a the answer for a HTTP GET request.
	public String getIndex(){
		return "index";
		/* Makes the GET response to index.html. Spring automatically searches in resources/templates for
		an .html named the return of the method, in this case "index".
		*/
	}

}
