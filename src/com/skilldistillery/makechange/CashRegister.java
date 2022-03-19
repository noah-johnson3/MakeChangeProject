package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		
		
//		//User Story #1
//		The user is prompted asking for the price of the item.
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Java-Mart please enter the price of the item: ");
		double itemPrice = kb.nextDouble();
//		kb.next();
//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.
		System.out.println("Please enter how much money you received: ");
		double moneyReceived = kb.nextDouble();
		
//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.
		if(moneyReceived < itemPrice) {
			System.out.println("That is not enough, don't play games with me!");
		} else if (moneyReceived == itemPrice) {
			System.out.println("Thanks for making my job easier and giving me exact change!");
		}
		
//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and 
		// coins that should be given to the customer.
		
	}
	
}
