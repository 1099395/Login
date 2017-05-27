package com.tcs.mcoe.controller;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.mcoe.model.User;
import com.tcs.mcoe.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserRepository userRepository;
  
  @RequestMapping(method = RequestMethod.POST, value="/authenticateUser")
  public Map<String, Object> getUser(@RequestBody Map<String, Object> userMap){
      Map<String, Object> response = new LinkedHashMap<String, Object>();
	String userName=(userMap.get("userName")==null)?null:userMap.get("userName").toString();
    String password=(userMap.get("password")==null)?null:userMap.get("password").toString();	
	if(userName==null){
		response.put("message","Invalid username");
		return response;
		}
	if(password==null){
		response.put("message" ,"Invalid password");
		return response;
   }
    User user = userRepository.findByUserNameAndPassword(userMap.get("userName").toString(),userMap.get("password").toString());
	if(user==null)
	response.put("Message","Invalid Credentials");
	else
	response.put("Message","Login Successful");
	return response;
   }
  // @RequestMapping(method = RequestMethod.GET, value="/getUser/{userName}")
  // public Map<String, Object> getAllUser(@PathVariable("userName") String userName){
    // User users = userRepository.findByUserName(userName);
    // Map<String, Object> response = new LinkedHashMap<String, Object>();
	// response.put("data",users);
    // return response;
  // }
 }
  

