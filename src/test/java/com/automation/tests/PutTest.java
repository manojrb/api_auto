package com.automation.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.exceptions.WebserviceException;
import com.automation.services.UserServices;
import com.json.autogen.User;

public class PutTest {
  @Test
  public void f() throws WebserviceException, IOException {
	  UserServices userServices = new UserServices();
	  
	  User users = new User();
	  users.setId("2");
	  users.setName("testManoja234");
	  users.setJob("nothing test");
	  User result = userServices.updateUserById(users);
	  System.out.println(result.toString());
	  
  }

}
