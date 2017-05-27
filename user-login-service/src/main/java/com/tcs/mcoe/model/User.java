package com.tcs.mcoe.model;

import org.springframework.data.annotation.Id;

public class User {
      private String userName;
  private String password;
  
  
  public User(){}
  
  public User(String firstName, String lastName, String title, String userName,String password,String emailId){
    
    this.userName= userName;
    this.password=password;
  }
  
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName= userName;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password= password;
  }
}

