package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Welcome to the Restaurant!");
		System.out.println("PLease enter the receipt total:");
		String receipt = scanner.nextLine();
		double receiptTotal = Double.parseDouble(receipt);

		System.out.println("Please enter amount paid:");
		String paid = scanner.nextLine();
		double paidTotal = Double.parseDouble(paid);

		if(paidTotal < receiptTotal) {
			System.out.println("Please give me more money");
		}
		if(paidTotal == receiptTotal) {
			System.out.println("You give no change");
		}
		if (paidTotal > receiptTotal) {
			System.out.println("The change required is " + (paidTotal - receiptTotal));
		}
	}

}
