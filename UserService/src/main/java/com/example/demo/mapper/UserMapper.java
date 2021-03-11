package com.example.demo.mapper;

import org.springframework.beans.BeanUtils;

import com.example.demo.entity.User;
import com.example.demo.model.UserDto;

public class UserMapper {

	public static UserDto convertUsertoUserdto(User userentity,UserDto userdto) {
		
	
	BeanUtils.copyProperties(userentity,userdto);
	
	return userdto;

}
	public static User convertUserDtotoUser(UserDto userdto,User userentity) {
		
		
		BeanUtils.copyProperties(userdto,userentity);
		
		return userentity;

}
}
