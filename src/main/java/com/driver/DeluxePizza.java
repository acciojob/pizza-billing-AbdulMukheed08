package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        setPrice(80);
        if(isVeg){
            setPrice(70);
        }
        else{
            setPrice(120);
        }
        setExtraCheesePrice();
        setExtraToppingPrice();
    }
}