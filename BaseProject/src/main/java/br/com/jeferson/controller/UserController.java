package br.com.jeferson.controller;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jeferson.domain.User;
import br.com.jeferson.repository.UserRepository;

=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

>>>>>>> origin/master
@Controller
@RequestMapping("/BaseProject")
public class UserController {

<<<<<<< HEAD
	@Autowired
	private UserRepository userRepository;
	
	private Iterable<User> users = new ArrayList<>();
	
	@RequestMapping("/admin/users")
	public String users() {
		users = userRepository.findAll();
		return "admin/users";
	}

	public Iterable<User> getUsers() {
		return users;
	}

	public void setUsers(Iterable<User> users) {
		this.users = users;
	}
	
=======
	
	@RequestMapping("/admin/users")
	public String users() {
		return "admin/users";
	}
>>>>>>> origin/master
	
}
