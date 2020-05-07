package com.occamsrazor.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.occamsrazor.web.utill.Messenger;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {
	@Autowired AdminService adminService;
	
	
	@PostMapping("/register")
	public Messenger post(@RequestBody Admin admin) {
		adminService.register(admin);
		return Messenger.SUCCESS;
	}
	
	@GetMapping("/list")
	public List<Admin> list(){
		System.out.println("aaa");
		return adminService.list();
	}
	
	@GetMapping("/{employNumber}")
	public Admin detail(@PathVariable String employNumber) {
		return adminService.findOne(employNumber);
	}
	
	@PutMapping("/{employNumber}")
	public Messenger put(@RequestBody Admin admin) {
		adminService.modify(admin);
		return Messenger.SUCCESS;
	}
	
	@DeleteMapping("/{employNumber}")
	public Messenger delet(@RequestBody Admin admin) {
		adminService.remove(admin);
		return Messenger.SUCCESS;
	}
	
	
	
}
