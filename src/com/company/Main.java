package com.company;

public class Main {

    public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Basic","Beef patty", 3.55,"White bread");
		hamburger.addHamburgerAddition1("Tomato",0.3);
		hamburger.addHamburgerAddition2("Lettuce", 0.2);
		hamburger.addHamburgerAddition3("Cheese", 0.5);
		System.out.println("Total price is: " + hamburger.itemizeHamburger());
		System.out.println();

		HealthyBurger healthyBurger = new HealthyBurger("Chicken", 5.31);
		healthyBurger.addHamburgerAddition1("Egg",1.41);
		healthyBurger.addHealthyAddition1("Cucumbers", 0.63);
		System.out.println("Total healthy burger price is: " + healthyBurger.itemizeHamburger());
		System.out.println();

		DeluxeBurger deluxeBurger = new DeluxeBurger();
		deluxeBurger.addHamburgerAddition3("Fries",2);
		System.out.println("Total healthy burger price is: " + deluxeBurger.itemizeHamburger());
    }
}
