package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String item ="";
        String loop="";
        double price =0;
        boolean condition = false;
        Scanner scan = new Scanner(System.in);

        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.println("Welcome to the Shopping Mania");
        System.out.println("Do you want to enter an item y/n");
        loop = scan.nextLine();
        while(!loop.equalsIgnoreCase("n")){
            System.out.println("Enter an item to add to your grocery list");
            item = scan.nextLine();

            System.out.println("Enter a price for your grocery item: ");
            price = scan.nextDouble();
            scan.nextLine();

            GroceryItems groceryItems = new GroceryItems(item, price);
            shoppingCart.addGroceryItems(groceryItems);

            System.out.println("Do you want to continue y/n");
            loop = scan.nextLine();

            condition = true;
        }
        if(condition) {
            System.out.println(shoppingCart.displayItems());
            System.out.println("The total price is: " + shoppingCart.total());
        }
        else{
            System.out.println("Thank you for using the system. Good Bieeeee....");
        }
    }
}
