package com.automation.api_requests;

import com.automation.exceptions.WebserviceException;
import com.automation.rest_api.RestApiKeywords;
import com.google.gson.Gson;
import com.json.autogen.User;

import io.restassured.response.Response;

public class UserRequests {
	Gson gson;
	
	public UserRequests(){
		gson = new Gson();
	}

	public Response getUser(int id) throws WebserviceException {
		return new RestApiKeywords().setEndPoint("api/users/"+id).get();
	}

	public Response postUser(User users) throws WebserviceException {
		return new RestApiKeywords().setEndPoint("api/users").setHeader("content-type", "application/json")
				.setBody(gson.toJson(users)).post();
	}
	
	public Response putUser(User users) throws WebserviceException {
		return new RestApiKeywords().setEndPoint("api/users/"+users.getId()).setHeader("content-type", "application/json")
				.setBody(gson.toJson(users)).put();
	}
	
	public Response deleteUser(int id) throws WebserviceException {
		return new RestApiKeywords().setEndPoint("api/users/"+id).setHeader("content-type", "application/json").delete();
	}
}
