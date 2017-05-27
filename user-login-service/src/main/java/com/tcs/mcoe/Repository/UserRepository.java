package com.tcs.mcoe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tcs.mcoe.model.User;

public interface UserRepository extends MongoRepository<User, String>{
public User findByUserName(String userName);
public User findByUserNameAndPassword(String userName,String password);
}

