package com.mosad.main;

import client.CalculatorWS;
import client.CalculatorWS_Service;

public class Main {

	public static void main(String[] args) {
		CalculatorWS_Service calculatorWS_Service = new CalculatorWS_Service();
		CalculatorWS calculatorWS = calculatorWS_Service.getCalculatorWSPort();
		int result = calculatorWS.add(3, 6);
		System.out.println("add - result = " + result);

		int res = calculatorWS.subtract(4, 1);
		System.out.println("subtract - res = " + res);
	}

}
