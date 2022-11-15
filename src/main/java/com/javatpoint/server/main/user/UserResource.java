package com.javatpoint.server.main.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
	
	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveUserById(@PathVariable int id) {
		User user= service.findOne(id);  
		if(user==null) {
		//runtime exception  
		throw new UserNotFoundException("id: "+ id);  
		}
		return service.findOne(id);
	}
	
//	@PostMapping("/users")
//	public void createUser(@RequestBody User user)
//	{
//		User savedUser = service.save(user);
//	}
	
	//method that posts a new user detail and returns the status of HTTP and location of the user resource  
	@PostMapping("/users")  
	public ResponseEntity<Object> createUser(@RequestBody User user)  
	{  
	User sevedUser=service.save(user);    
	URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId()).toUri();  
	return ResponseEntity.created(location).build();  
	}  
}
