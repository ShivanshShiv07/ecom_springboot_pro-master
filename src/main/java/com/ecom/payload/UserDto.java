package com.ecom.payload;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserDto {


	private int userId;
	
	@NotEmpty
	@Size(min = 4,max = 20,message = "name must be min of 4 characters and max of 20 character !!")
	@Pattern(regexp = "^[A-Za-z][A-Za-z0-9_]{7,29}$",message = "Invalid username !!")
	private String name;
	
	@Email(message = "enter valid Email !!")
	private String email;
	
	@NotEmpty
	@Size(min = 4,message = "Password must be of 4 digits !!")
	private String password;
	
	@NotEmpty
	private String about;
	
	private String address;
	
	private String gender;
	
	@NotBlank
	private String phone;
	
	private Date createAt;
	
	private boolean active;
	
	private Set<RoleDto> roles = new HashSet<>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	@JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<RoleDto> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleDto> roles) {
		this.roles = roles;
	}

	
}
