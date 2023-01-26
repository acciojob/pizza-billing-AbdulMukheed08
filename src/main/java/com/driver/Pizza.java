package com.driver;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private int price = 0 ;
    private Boolean isVeg;
    private String bill="";

    private int cheese = 80;
    private int toppings = 0;


    private boolean isExtraToppingsAdded;
    private boolean isExtraCheeseAdded;
    private boolean isExtraTakeawayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        bill += "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price += 80;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            toppings = 70;
        }
        else{
            toppings = 120;
        }
        if(!isExtraToppingsAdded){
            this.price += toppings;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isExtraTakeawayAdded){
            isExtraTakeawayAdded = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            isBillGenerated = true;

            if(isExtraCheeseAdded){
                bill += "Extra Cheese Added: "+cheese+"\n";
            }
            if(isExtraToppingsAdded){
                bill += "Extra Toppings Added: "+toppings+"\n";
            }
            if(isExtraTakeawayAdded){
                bill += "Paperbag Added: "+"20\n";
            }
            bill += "Total Price: "+this.price+"\n";
        }
        return this.bill;
    }
}
