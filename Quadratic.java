package com.bridgelab.functionalprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double a, b, c;
		double delta, root1, root2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of a:");
		a=sc.nextDouble();
		System.out.print("Enter a value of b:");
		b=sc.nextDouble();
		System.out.print("Enter a value of c:");
		c=sc.nextDouble();
		delta=b*b-4.0*a*c;
		if(delta>0) {
			root1=(-b + Math.sqrt(delta))/(2*a);
			root2=(-b + Math.sqrt(delta))/(2*a);
			System.out.println("The roots are"+ root1+ "and"+ root2);
			System.out.println("The roots are real and distinct");
		}
		else if(delta==0) {
			root1=root2=-b/(2*a);
			System.out.println("The root1 equal to root2:"+ root1);
			System.out.println("The roots are equall");
		}
		else {
			System.out.println("Then roots are complex and different");
		}
	}
}
