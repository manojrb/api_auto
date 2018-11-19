package com.automation.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.exceptions.WebserviceException;
import com.automation.services.UserServices;
import com.json.autogen.User;

public class PostTest {
  @Test
  public void f() throws WebserviceException, IOException {
	  UserServices userServices = new UserServices();
	  
	  User users = new User();
	  users.setName("testManoja");
	  users.setJob("nothing");
	  User result = userServices.createUser(users);
	  System.out.println(result.toString());
	  
  }

}
