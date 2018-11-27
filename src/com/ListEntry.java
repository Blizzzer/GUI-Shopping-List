package com;

public class ListEntry {
    private String product;
    private boolean isBought;
    private float price;

    public ListEntry(String product){
        this.product = product;
        isBought = false;
        price = -1;
    }

    public void buyIt(float price) {
        if(price >= 0) {
            this.price = price;
            isBought = true;
        } else {
            System.out.println("Invalid price");
        }
    }

    public String getProduct(){
        return product;
    }

    @Override
    public String toString() {
        return product + " | " + priceToString();
    }

    public String priceToString(){
        if(isBought) {
            return String.valueOf(price);
        } else {
            return "Not Bought";
        }
    }
}
