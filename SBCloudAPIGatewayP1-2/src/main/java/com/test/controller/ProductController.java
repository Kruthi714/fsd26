package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product2")
public class ProductController {
	@GetMapping("/service2")
	public String productService2() {
		return "this is simple spring cloud service";
	}
}
