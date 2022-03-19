package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pennies2, nickels2, dimes2, quarters2, dollars2, fives2, tens2, twenties2;
		
		double pennies = .01;
		double nickels = .05;
		double dimes = .1;
		double quarters = .25;
		double dollars = 1;
		double fives = 5;
		double tens = 10;
		double twenties = 20;
		double total = 0.0;
		double price = 0.0;
		double cash = 0.0;
		double change = 0.0;
		double cashLeft;
		
		
		System.out.println("Enter price :");
		price = sc.nextDouble();
		
		System.out.println("Enter amount of cash given: ");
		cash = sc.nextDouble();
		
		change = cash - price;
		
		twenties2 = (int) Math.floor(change / twenties);
		tens2 = (int) Math.floor((change - twenties2 * twenties) / tens);
		fives2 = (int) Math.floor((change - twenties2 * twenties - tens2 * tens) / fives);
		dollars2 = (int) Math.floor((change - twenties2 * twenties - tens2 * tens - fives2 * fives));

		cashLeft = change - twenties2 * twenties - tens2 * tens - fives2 * fives - dollars * dollars2;
	
		cashLeft = Math.round(cashLeft * 100.0) / 100.0;
		quarters2 = (int) Math.floor(cashLeft / .25);
		cashLeft = change - twenties2 * twenties - tens2 * tens - fives2 * fives - dollars2 * dollars
				- quarters2 * quarters;
		
		cashLeft = Math.round(cashLeft * 100.0) / 100.0;
		dimes2 = (int) Math.floor(change / dimes);
		cashLeft = change - twenties2 * twenties - tens2 * tens - fives2 * fives - dollars2 * dollars
				- quarters2 * quarters - dimes2 * dimes;
		
		cashLeft = Math.round(cashLeft * 100.0) / 100.0;
		nickels2 = (int) Math.floor(change / nickels);
		cashLeft = change - twenties2 * twenties - tens2 * tens - fives2 * fives - dollars2 * dollars
				- quarters2 * quarters - dimes2 * dimes - nickels2 * nickels;
		
		cashLeft = Math.round(cashLeft * 100.0) / 100.0;
		pennies2 = (int) Math.floor(change / pennies);

		if (twenties2 > 0) {
			System.out.println("$20.00: " + twenties2);
		}

		if (tens2 > 0) {
			System.out.println("$10.00: " + tens2);
		}

		if (fives2 > 0) {
			System.out.println("$5.00: " + fives2);
		}

		if (dollars2 > 0) {
			System.out.println("1.00: " + dollars2);
		}

		if (quarters2 > 0) {
			System.out.println("$0.25: " + quarters2);
		}

		if (dimes2 > 0) {
			System.out.println("$0.10: " + dimes2);
		}

		if (nickels2 > 0) {
			System.out.println("$0.05: " + nickels2);
		}

		if (pennies2 > 0) {
			System.out.println("$0.01: " + pennies2);
		}
	}

}
