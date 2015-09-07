package br.com.jeferson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jeferson.domain.User;
import br.com.jeferson.repository.UserRepository;

@Controller
//@RequestMapping("/BaseProject")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	private List<User> users = new ArrayList<>();
	
	@RequestMapping("/admin/users")
	public String users(Model model) {
		users = userRepository.findAll();
		model.addAttribute("users", users);
		return "admin/users";
	}
	
}
