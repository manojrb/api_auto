package com.automation.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.exceptions.WebserviceException;
import com.automation.services.UserServices;

public class DeleteTest {
  @Test
  public void f() throws WebserviceException, IOException {
	  UserServices userServices = new UserServices();
	  
	  userServices.deleteUserByID(2);
	  
  }

}
