package com.occamsrazor.web.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.occamsrazor.web.utill.Messenger;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired UserSevice userService;
	
	@PostMapping("/register")
	public Messenger post(@RequestBody User user) {
		userService.register(user);
		return Messenger.SUCCESS;
	}
	
	@GetMapping("/list")
	public List<User> list(){
		return userService.findAll();
	}
	
	@GetMapping("/{userId}")
	public User detail(@PathVariable String userId) {
		return userService.fideOne(userId);
	}
	
	
}
