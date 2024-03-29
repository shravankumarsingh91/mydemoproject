package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial html form
	@RequestMapping("/showForm")
	public String showForm() {

		return "helloworld-form";
	}

	// need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {

		return "helloworld";
	}

	@RequestMapping("/processFormVersiontwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// read the request parammeter from the html form
		String theName = request.getParameter("studentName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// Create the message
		String result = "YO! " + theName;

		// add the message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// convert the data to all caps
		theName = theName.toUpperCase();

		// Create the message
		String result = "Hey My Friend from v3! " + theName;

		// add the message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}

}
