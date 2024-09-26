package com.example.UserData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserData.model.User;
import com.example.UserData.service.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService uService;
	
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public String createUser(@Valid @RequestBody User u)
	{
		return uService.createUser(u);
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> readUsers()
	{
		return uService.getUsers();
	}
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.DELETE)
	public String deleteUsers(@PathVariable(value="id") Long id)
	{
		uService.deleteUser(id);
		return "successfully deleted values from the database."; 
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
	public String readUsers(@PathVariable(value = "id") Long id, @RequestBody User userDetails) {
	    uService.updateUser(id, userDetails);
	    return "updated the required field";
	}
	

}
