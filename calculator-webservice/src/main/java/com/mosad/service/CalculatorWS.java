package com.mosad.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

	@WebMethod(operationName = "add")
	public int add(int number1, int number2) {
		return number1 + number2;
	}
	
	@WebMethod(operationName = "subtract")
	public int subtract(int number1, int number2) {
		return number1 - number2;
	}
}
