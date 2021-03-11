package com.example.demo.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.fiegnclient.FiegnClient;
import com.example.demo.model.UserDto;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	private final UserService userService;
	@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
	@Autowired
	FiegnClient fiegnClient;
	@PostMapping("/registeruser")
	public ResponseEntity<?> registeruser(@Valid @RequestBody UserDto userdetails) {
		LOGGER.debug("Triggered userRestController.userInput");
		UserDto user = userService.findByUserName(userdetails.getUsername());
		System.out.println("............."+ user.getUsername());
		if(user.getUsername()!=null && user.getUsername().equals(userdetails.getUsername())) {
			return new ResponseEntity<>("user name already exixsted", HttpStatus.IM_USED);
		}
		if(user.getUsername()==null) {
			UserDto userdetails1 = userService.registeruser(userdetails);
			return new ResponseEntity<>(userdetails1, HttpStatus.OK);
		}
		return null;
		
		}
	@GetMapping("/test/{username}")
	public ResponseEntity<?> getbookingbyusername1(@PathVariable String username){
		return fiegnClient.getbookingbyusername(username);
	}

	@GetMapping("/byname/{username}")
	public UserDto findByUsername(@PathVariable String username) {
		return userService.findByUserName(username);
	}

	
}