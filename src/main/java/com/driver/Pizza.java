package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    private boolean added[];

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        added = new boolean[3];
        if(this.isVeg){
            this.price = 300;
            this.bill+="Base Price Of The Pizza: "+this.price+"\n";
        }
        else{
            this.price = 400;
            this.bill+="Base Price Of The Pizza: "+this.price+"\n";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
     if(!this.added[0]) {
         this.added[0]=true;
         this.price += 80;
         this.bill += "Extra Cheese Added: 80\n";
     }
    }

    public void addExtraToppings(){
        if(!this.added[1]) {
            this.added[1]=true;
            if (isVeg) {
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            } else {
                this.price += 120;
                this.bill += "Extra Toppings Added: 120\n";
            }
        }
    }

    public void addTakeaway(){
//        boolean added=false;
        if(!this.added[2]) {
            this.added[2] =true;
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        this.bill+="Total Price: "+this.price;
        return this.bill;
    }
}
