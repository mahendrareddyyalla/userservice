package com.example.demo.model;

import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;




public class UserDto {
	private int id;
    @NotEmpty(message="first name should not be empty")
    @Size(max = 100)
    private String firstName;
    @NotEmpty(message="last name should not be empty")
    @Size(max = 100)
    private String lastName;
    @NotEmpty(message="user name should not be empty")
    private String username;
    @Size(min = 5, max = 50,message="password should be min 5")
    private String password;
	
    @Pattern(regexp = "\\d{9,11}")
    private String phoneNumber;
    @NotEmpty(message="email should not be empty")
    @Email
    private String email;
    
    
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "UserDto [email=" + email + ", phoneNumber=" + phoneNumber + ", id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", username=" + username + ", password=" + password + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        UserDto that = (UserDto) o;
	        return true;
	                
	    }

    
}