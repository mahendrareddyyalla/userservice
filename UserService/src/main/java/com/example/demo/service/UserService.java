package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.model.UserDto;
@Service
public interface UserService {

	UserDto registeruser(UserDto userdetails);

	UserDto findByUserName(String username);

}
