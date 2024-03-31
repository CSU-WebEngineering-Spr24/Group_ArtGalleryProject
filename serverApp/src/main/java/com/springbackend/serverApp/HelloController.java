package com.springbackend.serverApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/hello-multiple")
    public String helloMultiple(@RequestParam("name") List<String> names) {
        StringBuilder greeting = new StringBuilder();
        greeting.append("Hello, ");
        for (String name : names) {
            greeting.append(name).append(" and ");
        }
        greeting.delete(greeting.length() - 5, greeting.length()); // Remove the last comma and space
        greeting.append("!");
        return greeting.toString();
    }


}