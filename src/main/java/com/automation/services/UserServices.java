package com.automation.services;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.automation.api_requests.UserRequests;
import com.automation.exceptions.WebserviceException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.json.autogen.User;

import io.restassured.response.Response;

public class UserServices {
	public ObjectMapper mapper;
	public UserRequests userRequests;
	public UserServices() {
		mapper = new ObjectMapper();
		userRequests = new UserRequests();
	}
	
	public User getUserByID(int id) throws WebserviceException, IOException{
		  
		  Response response = userRequests.getUser(id);
		  assertEquals(response.getStatusCode(), 200);
		  User result = getUserTypeReference(response);
		  return result;
	}
	
	public User createUser(User users) throws WebserviceException, IOException {
		  Response response = userRequests.postUser(users);
		  assertEquals(response.getStatusCode(), 201);
		  User result = getUserTypeReference(response);
		  return result;
	}
	
	public User updateUserById(User users) throws WebserviceException, IOException {
		  Response response = userRequests.postUser(users);
		  assertEquals(response.getStatusCode(), 201);
		  User result = getUserTypeReference(response);
		  return result;
	}
	
	public void deleteUserByID(int id) throws WebserviceException, IOException{
		  Response response = userRequests.deleteUser(id);
		  assertEquals(response.getStatusCode(), 204);
	}

	private User getUserTypeReference(Response response) throws IOException {
		ObjectReader objectReader = mapper.reader().forType(new TypeReference<User>(){});
		  User result = objectReader.readValue(response.getBody().asInputStream());
		return result;
	}
	
	

}
