package net.javaguides.springboot.controller;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.javaguides.springboot.model.User;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	

	// create employee rest api
	@PostMapping("/user")
	public User createAccount(@RequestBody User user) {
		return userRepository.save(user);
	}

	
}
