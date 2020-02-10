package pizza;

import java.util.Scanner;

public class Pizza {
	// Attributes / Variables
	public int numToppings;
	public String toppingName = "";
	public int size; // as diameter
	public double price;
	public String crustType; // deep, thin, regular, stuffed
	public int bakeTemp; // in fahrenheit
	public static Scanner sc = new Scanner(System.in);
	
	//Behaviors/Methods	
	public void throwIt() {
		int diameter = 6;
		
		do {
			System.out.println("Throwing the dough!");
			diameter += 2;
		} while (diameter < size);
		
		System.out.println("Crust is ready!");
		
	}
	
	public void customize(String s) {
		System.out.println("Adding " + s + " sauce...");
		System.out.println("Adding cheese...");
		int topping = 0;
		
		while(topping < numToppings) {
			
			System.out.println("What topping to add: ");
			String name = sc.nextLine();
			toppingName += name + ", ";
			topping++;
		
		}
		
		System.out.println("Added the following " + toppingName);
	}
	
	public void bake() {
		System.out.println("Baking at  " + bakeTemp + "F.");
		
		int timer = 18;
		
		while (timer > 0) {
			System.out.println("Waiting for pizza");
			timer--;
		}
		System.out.println("Pizza is done!");
	}
	
	public void updatePrice() {
		double newPrice = 0;
		
		if (size < 12) {
			newPrice = price + (numToppings * 1.00);
		}
		else if (size < 18) {
			newPrice = price + (numToppings * 2.00);	
		}
		else if (size < 24) {
			newPrice = price + (numToppings * 3.00);	
		}
		else {
			newPrice = price + (numToppings * 4.00);	
		} 
		
		price = newPrice;
		
		System.out.println("Your pizza costs $" + newPrice);
		
	}
	
	public void slice(int num) {
		System.out.println("Slicing out pizza with a pizza cutter!");
		for (int a = 0; a < num/2; a++) {
			System.out.println("Making slice.");
		}
		System.out.println("Your pizza now as " + num + " slices.");
	}
	
	public void boxPizza() {
		if (size < 12) {
			System.out.println("Your pizza is in a small box");
			Store.updateBoxInventory('s');
			// box in small
		}
		else if (size < 18) {
			System.out.println("Your pizza is in a medium box");
			Store.updateBoxInventory('m');
			// box in medium
		}
		else if (size < 24) {
			System.out.println("Your pizza is in a large box");
			Store.updateBoxInventory('l');
			// box in large
		}
	}
	
	public String toString() {
		String output = "";
//		output += "Number of Toppings = " + numToppings + "\n";
//		output += "Topping Name = " + toppingName + "\n";
//		output += "Pizza size = " + size + "\n";
//		output += "Crust type = " + crustType + "\n";
//		output += "Pizza price = " + price + "\n";
//		output += "Baking Temperature = " + bakeTemp + "\n";
		output += 	crustType + 
					" - " + toppingName + 
					" - " + price + 
					" - " + size;
		return output;
	}

}
