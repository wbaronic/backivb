package com.ivb.englishApp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping("/users")
public class UserController {

	  @Autowired
	    private UserServiceImpl userServiceImpl;
	    
	    @PostMapping("/create")
	    public ResponseEntity<User> createUser(@RequestBody User user){
	        User userCreated = this.userServiceImpl.createUser(user);
	        return new ResponseEntity<User>(userCreated, HttpStatus.CREATED);
	    }
	    
	    // update it with UserDto
	    @GetMapping("/get/{id}")
	    public ResponseEntity<UserDto> getUser(@PathVariable("id") int userId){
	        UserDto userDto = this.userServiceImpl.getUser(userId);
	        return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
	    }
}