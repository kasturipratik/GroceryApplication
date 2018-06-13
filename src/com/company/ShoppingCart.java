package com.company;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<GroceryItems> groceryItems;

    public ShoppingCart(){
        groceryItems = new ArrayList<GroceryItems>();
    }

    /*
        method to add all the entered contents in grocery class to array list groceryItem
    */
    public void addGroceryItems(GroceryItems adding){
        this.groceryItems.add(adding);
    }

    //calculating the total of the grocery entered by looping the grocery array
    public  double total(){

        double totalPrice = 0;
        for(GroceryItems gro : groceryItems){
            totalPrice += gro.getPrice();
        }
        return totalPrice;
    }

    // displaying all the items from grocery
    public String displayItems(){
        String display ="";
        for(GroceryItems gro : groceryItems){
            display += gro.getName() + "\t\t\t"+ gro.getPrice() +"\n";
        }

        return display;
    }
}
