package com.bridgelab.functionalprograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperature=sc.nextDouble();
		double windSpeed=sc.nextDouble();
	        if(temperature < 50 && windSpeed < 120 && windSpeed > 3) {
	        	double windChil= 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
	        	System.out.println("Temperature = " + temperature);
	        	System.out.println("Wind speed  = " + windSpeed);
	        	System.out.println("Wind chill  = " + windChil);
	        }
	        else {
	        	System.out.println("Please enter valid values.");
	        }
	 }
}
