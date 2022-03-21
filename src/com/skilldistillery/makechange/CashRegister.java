package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.println("Welcome to Java-Mart please enter the price of the item: ");
		double itemPrice = kb.nextDouble();

		System.out.println("Please enter how much money you received: ");
		double moneyReceived = kb.nextDouble();

		int change = (int) ((moneyReceived - itemPrice) * 100);

		if (itemPrice > moneyReceived) {

			System.out.println("Bad user give me more money!");

		}

		if (itemPrice == moneyReceived) {

			System.out.println("Good User! You gave me exact change!");

		}

		while (change >= 0) {

			int numOfBills;

			if (change / 1000 >= 1) {

				numOfBills = (int) change / 1000;
				change %= 1000;
				System.out.println("Here is " + numOfBills + " ten dollar bill(s)");
				continue;

			} else if (change / 500 >= 1) {

				numOfBills = (int) change / 500;
				change %= 500;
				System.out.println("Here is " + numOfBills + " five dollar bill(s)");

				continue;

			} else if (change / 100 >= 1) {

				numOfBills = (int) change / 100;
				change %= 100;

				System.out.println("Here is " + numOfBills + " one dollar bill(s)");
				continue;

			} else if (change / 25 >= 1) {

				numOfBills = (int) (change / 25);
				change %= 25;

				System.out.println("Here is " + numOfBills + " quarter(s)");
				continue;

			} else if (change / 10 >= 1) {

				numOfBills = (int) (change / 10);
				change %= 10;

				System.out.println("Here is " + numOfBills + " dime(s)");
				continue;

			} else if (change / 5 >= 1) {

				numOfBills = (int) (change / 5);
				change %= 5;

				System.out.println("Here is " + numOfBills + " nickel(s)");
				continue;

			} else if (change / 1 >= 1) {
				numOfBills = (int) (change / 1);
				change %= 1;
				System.out.println("Here is " + numOfBills + " pennie(s)");
				break;

			}
		}
	}
}
