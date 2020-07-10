package com.noblewolf.EstudoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noblewolf.EstudoSpring.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L,"Adolfo","adolfogotler@gmail.com","996877498","123456789");
		return ResponseEntity.ok().body(user);
	}
	
}
