package br.com.jeferson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/BaseProject")
public class UserController {

	
	@RequestMapping("/admin/users")
	public String users() {
		return "admin/users";
	}
	
}
