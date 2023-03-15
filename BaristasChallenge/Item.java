// package BaristasChallenge;

/**
 * Item
 */
public class Item {

    // Set the member variables to private instead of public.
    // MEMBER VARIABLES
    private String name;
    private double price;

    // Add a constructor to your Item class that takes a String name and double price as 
    // arguments to set the name and price for that object on instantiation.
    Item(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }


    // GETTERS & SETTERS - for name and price
    // Create getters and setters for all the member variables.
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }


}