package br.com.jeferson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/BaseProject")
public class BaseController {

	
	@RequestMapping({"/", "/index", "/home"} )
	public String index() {
		return "usuario";
	}
	
}
