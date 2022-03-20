package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int price;
		int provided;
		int change;

		System.out.print("Enter the price:");
		price = (int) Math.round(sc.nextDouble() * 100);

		System.out.print("Enter the amount given by the customer:");
		provided = (int) Math.round(sc.nextDouble() * 100);

		if (provided > price) {
			System.out.println("The change is: " + ((provided - price) / 100.00));
			System.out.println("Give the customer :");

			change = provided - price;
			int twenties = change / 2000;

			if (twenties > 0) {
				change = change % 2000;
				System.out.println(twenties + " $20 bills");
			}

			int tens = change / 1000;
			if (tens > 0) {
				change = change % 1000;
				System.out.println(tens + " $10 bills");
			}

			int fives = change / 500;
			if (fives > 0) {
				change = change % 500;
				System.out.println(fives + " $5 bills");
			}

			int ones = change / 100;
			if (ones > 0) {
				change = change % 100;
				System.out.println(ones + " $1 bills");
			}

			int quarters = change / 25;
			if (quarters > 0) {
				change = change % 25;
				System.out.println(quarters + " quarters");
			}

			int dimes = change / 10;
			if (dimes > 0) {
				change = change % 10;
				System.out.println(dimes + " dimes");
			}

			int nickels = change / 5;
			if (nickels > 0) {
				change = change % 5;
				System.out.println(nickels + " nickels");
			}
			int pennies = change;
			System.out.println(pennies + " pennies");
		}
		if (provided < price) {
			System.out.print("Not enough money!");
		} else if (provided == price) {
			System.out.print("No change is necessary!");
		}
		sc.close();
	}
}