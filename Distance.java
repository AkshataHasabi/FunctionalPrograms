package com.bridgelab.functionalprograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int number1, number2;
		double totalDistance;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of Number1:");
		number1=sc.nextInt();
		System.out.print("Enter a value of Number2:");
		number2=sc.nextInt();
		totalDistance=Math.sqrt(Math.pow(number1, 2)+Math.pow(number2, 2));
		System.out.println(totalDistance);
	}
}
