package com.bridgelab.functionalprograms;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.print("Enter 2D array size:");
		Scanner sc = new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int array[][]=new int[rows][columns];
		System.out.println("Enter"+" "+rows * columns+" "+"Elements to store in Array:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		System.out.print("Elements in Array are:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.println("Row["+i+"]: columns["+j+"]:"+ array[i][j]);
			}
		}
	}
}
