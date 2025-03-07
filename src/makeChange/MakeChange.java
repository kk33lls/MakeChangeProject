package makeChange;

import java.util.Scanner;


public class MakeChange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double change = 0;
		double tender;
		double price;
		

		System.out.println("Enter the price of an item: ");
		price = sc.nextDouble();
		
		System.out.println("How much money was tendered?");
		tender = sc.nextDouble();
		
		if (price > tender) {
			System.out.println("The amount tendered is less than the price of the item, please try again.");
			System.exit(0);
		}
		if (price == tender) {
			System.out.println("The amount tendered was exact. Thank you!");
			System.exit(0);
		} 

		change = tender - price;
		double changeRounded = Math.round(change * 100.0) / 100.0;
		System.out.print("Change owed is: " + changeRounded + ". ");	
			
		//Change returned in twenties
			int twenties = calculateTwenties(change);
			change -= twenties * 20.00;
			
			if(twenties == 1) {
				System.out.print(twenties + " twenty dollar bill, ");
			}
			else if(twenties > 0) {
				System.out.print(twenties + " twenty dollar bills, ");
			}
			
			//Change returned in tens
			int tens = calculateTens(change);
			change  -= tens * 10.00;
			
			if(tens == 1) {
				System.out.print(tens + " ten dollar bill, ");
			}
			else if (tens > 0) {
				System.out.print(tens + " ten dollar bills, ");
			}
			
			//Change returned in fives
			int fives = calculateFives(change);
			change  -= fives * 5.00;
			
			if(fives == 1) {
				System.out.print(fives + " five dollar bill, ");
			}
			else if (fives > 0) {
				System.out.print(fives + " five dollar bills, ");
			}
			
			//Change returned in ones
			int ones = calculateOnes(change);
			change  -= ones * 1.00;
			
			if(ones == 1) {
				System.out.print(ones + " one dollar bill, ");
			}
			else if (ones > 0) {
				System.out.print(ones + " one dollar bills, ");
			}
			
			//Change returned in quarters
			int quarters = calculateQuarters(change);
			change  -= quarters * .25;
			
			if(quarters == 1) {
				System.out.print(quarters + " quarter, ");
			}
			else if (quarters > 0) {
				System.out.print(quarters + " quarters, ");
			}
			
			//Change returned in dimes
			int dimes = calculateDimes(change);
			change  -= dimes * .10;
			
			if(dimes == 1) {
				System.out.print(dimes + " dime, ");
			}
			else if (dimes > 0) {
				System.out.print(dimes + " dimes, ");
			}
			
			//Change returned in nickels
			int nickels = calculateNickels(change);
			change  -= nickels * .05;
			
			if (nickels > 0) {
				System.out.print(nickels + " nickel, ");
			}
			
			
			//Change returned in pennies
			int pennies = calculatePennies(change);
			change  -= pennies * .01;
			
			if (pennies == 1) {
				System.out.print(pennies + " penny, ");
			}
			else if(pennies > 0) {
				System.out.print(pennies + " pennies, ");
			}
			
			sc.close();

	}
	public static int calculateTwenties(double change) {
		int twenties = 0;
		
		while (change >= 20.00) {
			twenties++;
			change = change - 20.00;
		}
		return twenties;
	}
	public static int calculateTens(double change) {
		int tens = 0;
		
		while (change >= 10.00) {
			tens++;
			change = change - 10.00;
		}
		return tens;
	}
	public static int calculateFives(double change) {
		int fives = 0;
		
		while (change >= 5.00) {
			fives++;
			change = change - 5.00;
		}
		return fives;
	}
	public static int calculateOnes(double change) {
		int ones = 0;
		
		while (change >= 1.00) {
			ones++;
			change = change - 1.00;
		}
		return ones;
	}
	public static int calculateQuarters(double change){
		int quarters = 0;
		
		while (change >= .25){
			quarters++;
			change = change - .25;
		}
		return quarters;
	}
	public static int calculateDimes(double change){
		int dimes = 0;
		
		while (change >= .10){
			dimes++;
			change = change - .10;
		}
		return dimes;
	}
	public static int calculateNickels(double change){
		int nickels = 0;
		
		while (change >= .05){
			nickels++;
			change = change - .05;
		}
		return nickels;
	}
	public static int calculatePennies(double change){
		int pennies = 0;
		
		while (change >= .01){
			pennies++;
			change = change - .01;
		}
		return pennies;
	}
}
