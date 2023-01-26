package com.driver;

import java.util.*;
import java.util.ArrayList;

public class Pizza {

    private int price = 0;
    private int extraToppingPrice = 0;
    private Boolean isVeg;
    private String bill = "";

    Map<String,Integer> map = new LinkedHashMap<>();
    //List<String> list = Main.getList();


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) setPrice(300);
        else setPrice(400);

    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price += price;
        map.put("Base Price Of The Pizza: ",this.price);
    }


    public void addExtraCheese(){
        // your code goes here
        if(map.containsKey("Extra Cheese Added: ")==false){
            map.put("Extra Cheese Added : ",80);
            price += 80;
        }
    }
    public void setExtraCheesePrice(){
        map.put("Extra Cheese Added: ",0);
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            extraToppingPrice = 70;
        }
        else{
            extraToppingPrice = 120;
        }
        if(map.containsKey("Extra Toppings Added: ")==false){
            map.put("Extra Toppings Added : ",extraToppingPrice);
            price += extraToppingPrice;
        }
    }
    public void setExtraToppingPrice(){
        map.put("Extra Toppings Added: ",0);
    }

    public void addTakeaway(){
        // your code goes here
        if(map.containsKey("Paperbag Added: ")==false){
            map.put("Paperbag Added: ",20);
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        map.put("Total Price: ",this.price);

        for(String s : map.keySet()){
            if(map.get(s) != 0){
                bill += s + String.valueOf(map.get(s)) + "\n";
            }
        }

        return this.bill;
    }
}