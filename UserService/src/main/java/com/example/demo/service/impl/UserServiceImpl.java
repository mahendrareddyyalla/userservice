package com.example.demo.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
@Service         //(value = "userService")
public class UserServiceImpl implements UserService {//,UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDto registeruser(UserDto userdetails) {
		// TODO Auto-generated method stub
		User userEntity = new User();
		UserDto userdto= new UserDto();
		//BeanUtils.copyProperties(userdetails, userEntity);
		 userEntity=UserMapper.convertUserDtotoUser(userdetails, userEntity);
		User user= userRepository.save(userEntity);
		if(!(user==null)) {
			userdto = UserMapper.convertUsertoUserdto(user, userdto);
			}
			return userdto;
		//return user;
	}

	@Override
	public UserDto findByUserName(String username) {
		// TODO Auto-generated method stub
		UserDto userdto= new UserDto();
		User user=userRepository.findByUsername(username);
		//BeanUtils.copyProperties(user,userdto);
		if(!(user==null)) {
		userdto = UserMapper.convertUsertoUserdto(user, userdto);
		}
		return userdto;
	}

	/*
	 * public UserDetails loadUserByUsername(String username) throws
	 * UsernameNotFoundException { System.out.println("username =====>> "+username);
	 * UserDto user = findByUserName(username); if (user == null) { throw new
	 * UsernameNotFoundException("Invalid username or password."); } return new
	 * org.springframework.security.core.userdetails.User(user.getUsername(),
	 * user.getPassword(), getAuthority()); } private List<SimpleGrantedAuthority>
	 * getAuthority() { return Arrays.asList(new
	 * SimpleGrantedAuthority("ROLE_ADMIN")); }
	 */
}
