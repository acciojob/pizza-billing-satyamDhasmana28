package com.driver;
import java.util.HashSet;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    HashSet<String> set = new HashSet<>();
    public Pizza(Boolean isVeg){ //constructor
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg) {
            this.price = 300;
        }
        else {
            this.price = 400;
        }

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!set.contains("Cheese")) {
            this.price += 80;
            bill += ("Extra Cheese Added: 80" + "\n");
        }
        set.add("Cheese");
    }

    public void addExtraToppings() {
        // your code goes here
        if (!set.contains("Toppings")) {
            if (isVeg) {
                this.price += 70;
                bill += ("Extra Toppings Added: 70" + "\n");
            } else {
                this.price += 120;
                bill += ("Extra Toppings Added: 120" + "\n");
            }
        }
        set.add("Toppings");
    }

    public void addTakeaway(){
        // your code goes here
        if(!set.contains("takeaway")){
            this.price += 20;
            bill += ("Paperbag Added: 20"+"\n");
        }
        set.add("takeaway");
    }

    public String getBill(){
        // your code goes here
        if(!set.contains("GetBill")){
            bill += ("Total Price: "+this.price+"\n");
        }
        set.add("GetBill");
        return this.bill;
    }
}