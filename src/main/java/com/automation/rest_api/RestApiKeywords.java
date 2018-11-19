package com.automation.rest_api;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.ParseException;
import org.testng.Reporter;

import com.automation.exceptions.WebserviceException;
import com.automation.utilities.PropertyUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestApiKeywords {

	private Object body;
	private Map<String, String> header;
	PropertyUtil propertyUtil;
	private String endPoint;

	public Object getBody() {
		return body;
	}

	public RestApiKeywords setBody(Object body) {
		this.body = body;
		return this;
	}

	public RestApiKeywords() {
		header = new HashMap<String, String>();
		propertyUtil = new PropertyUtil();
	}

	public Map<String, String> getHeader() {
		return header;
	}

	public RestApiKeywords setHeader(String key, String value) {
		header.put(key, value);
		return this;
	}

	/**
	 * @description Get the json response from respetive URI With out authentication
	 * @param URI
	 * @return Json Response
	 * @throws WebserviceException
	 * @throws ParseException
	 */
	public Response get() throws WebserviceException {

		Response response = null;
		try {
			RequestSpecification request = RestAssured.given().headers(header);
			response = request.when()
					.get(PropertyUtil.getProperty("url") + endPoint);
			
			Reporter.log(response.asString());

		} catch (Exception e) {
			throw new WebserviceException(
					"Failed to fetch the response from URI" + PropertyUtil.getProperty("url") + endPoint);
		}
		return response;

	}

	public Response post() throws WebserviceException {
		Response response = null;
		try {
			response = RestAssured.given().headers(header).body(body).when()
					.post(PropertyUtil.getProperty("url") + endPoint);
			Reporter.log(response.asString());
			
		} catch (Exception e) {
			throw new WebserviceException(new Throwable(
					"Error occured  " + PropertyUtil.getProperty("url") + endPoint + "\n" + e.getMessage()));
		}
		return response;
	}

	// public Response Put( String URI ,Object body) throws
	// WebserviceException{return Put( URI,body, null);}

	public Response put() throws WebserviceException {
		Response response = null;

		try {
			response = RestAssured.given().headers(header).body(body).when()
					.put(PropertyUtil.getProperty("url") + endPoint);
			
			Reporter.log(response.asString());

		} catch (Exception e) {
			throw new WebserviceException(new Throwable(
					"Error occured  " + PropertyUtil.getProperty("url") + endPoint + "\n" + e.getMessage()));
		}
		return response;
	}

	public Response delete() throws WebserviceException {
		Response response = null;
		try {
			response = RestAssured.given().headers(header).when()
					.delete(PropertyUtil.getProperty("url") + endPoint);
			
			Reporter.log(response.asString());
		} catch (Exception e) {
			throw new WebserviceException(new Throwable(
					"Error occured  " + PropertyUtil.getProperty("url") + endPoint + "\n" + e.getMessage()));
		}
		return response;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public RestApiKeywords setEndPoint(String endPoint) {
		this.endPoint = endPoint;
		return this;
	}
}
