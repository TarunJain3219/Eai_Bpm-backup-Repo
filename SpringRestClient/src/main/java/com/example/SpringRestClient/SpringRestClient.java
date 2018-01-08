package com.example.SpringRestClient;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.ws.rs.core.UriBuilder;

import org.codehaus.jettison.json.JSONArray;
import org.springframework.web.client.RestTemplate;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class SpringRestClient {
	private static RestTemplate restTemplate = new RestTemplate();
	 private static final String baseURL = "http://localhost:6666/Spring4Hibernate4_Integration/AllEmployees";
	 
	 public static void main(String[] args)  {
		 String employee=restTemplate.getForObject("http://localhost:6666/Spring4Hibernate4_Integration/AllEmployees", String.class,200);
		 System.out.println(employee);

	 }
	
	
}
