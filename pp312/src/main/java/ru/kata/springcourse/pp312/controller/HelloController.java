package ru.kata.springcourse.pp312.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hi!");
		messages.add("You using Spring MVC application, your User-list is empty now");
		messages.add("You can managed your users, just add a user!");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}