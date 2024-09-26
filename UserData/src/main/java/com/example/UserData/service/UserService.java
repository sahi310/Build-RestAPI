package com.example.UserData.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.UserData.model.User;
import com.example.UserData.repository.UserRepository;


import java.util.List;

@Service
public class UserService {
	
	@Autowired
		UserRepository uRepository;
	
	//Create

	public String createUser( User u)
	{
		uRepository.save(u);
		return "successfully inserted values inside database.";
		
	}
	
	//read
	
	public List<User> getUsers()
	{
		return uRepository.findAll();
	}
	
	//delete 
	public void deleteUser(Long id)
	{
		 uRepository.deleteById(id);
		
	}
	
	//update
	public String updateUser(Long id, User userDetails) {
		
		User user1 = uRepository.findById(id).orElseThrow();

	    user1.setUsername(userDetails.getUsername());
	    user1.setPhone(userDetails.getPhone());
	    user1.setEmail(userDetails.getEmail());
	    
	   uRepository.save(user1);
	   
	   return " Table got updated";
	}
		

}

