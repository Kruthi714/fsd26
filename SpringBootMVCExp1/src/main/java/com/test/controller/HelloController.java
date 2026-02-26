package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpServerErrorException;

import com.test.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
//to convert java class into mvc class
public class HelloController {
	@RequestMapping
	public String homepage() {
		return "welcome";
	}
	@RequestMapping("/user")
	public String userForm() {
		return "userform";
	}
	@RequestMapping("/submit")
	public String submitUserData(HttpServletRequest request,User uobj,Model model) {
		String user=request.getParameter("username");
		String pas=request.getParameter("password");
		uobj.setUsername(user);
		uobj.setPassword(pas);
		model.addAttribute("info", uobj);
		if(user.equals("admin") && pas.equals("java")) {
			return "success";
		}
		else {
			return "userform";
		}
	}

}
