package com.automation.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.exceptions.WebserviceException;
import com.automation.services.UserServices;
import com.json.autogen.User;

public class GetTest {
  @Test
  public void f() throws WebserviceException, IOException {
	  UserServices userServices = new UserServices();
	  User users = userServices.getUserByID(2);
		System.out.println(users.toString());
	}
}
