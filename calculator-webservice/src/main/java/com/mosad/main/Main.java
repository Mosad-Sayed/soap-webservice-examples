package com.mosad.main;

import javax.xml.ws.Endpoint;

import com.mosad.service.CalculatorWS;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start");
		Endpoint.publish("http://192.168.0.2:8080/soap/calculator", new CalculatorWS());
		System.out.println("End");
	}
}
