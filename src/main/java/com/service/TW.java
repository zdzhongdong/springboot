package com.service;

import javax.xml.ws.Endpoint;


public class TW {

	public static void main(String[] args) {
		Endpoint.publish("http://192.168.1.253:8080/userEntity", new UserWebServiceImpl());
	}
}
