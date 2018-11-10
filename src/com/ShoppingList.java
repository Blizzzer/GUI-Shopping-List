package com;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList extends ArrayList<ListEntry> {
    private Scanner reader;

    public ShoppingList(Scanner reader){
        super();
        this.reader = reader;
    }

    public void printNumberOfProducts() {
        System.out.println("You have " + this.size() + " products in your shopping list.");
    }

    public boolean dispatchAction(int decision) {
        switch (decision) {
            case 1: {
                showListAction();
                break;
            }
            case 2: {
                deleteProductAction();
                break;
            }
            case 3: {
                buyProductAction();
                break;
            }
            case 4: {
                addProductAction();
                break;
            }
            case 5: {
                clearListAction();
                break;
            }
            case 6: {
                return false;
            }
            default: PrinterLibrary.wrongDecision();
        }
        return true;
    }

    private void showListAction() {
        System.out.println();
        System.out.println("Your shopping list:");
        PrinterLibrary.separator();
        this.forEach((entry) -> System.out.println(entry.getProduct() + " | " + entry.priceToString()));
        System.out.println();
        PrinterLibrary.separator();
    }

    private void deleteProductAction(){
        System.out.println("Please enter product index ...");
        int index = reader.nextInt();
        if(!isIndexValid(index)){
            System.out.println("You have entered invalid product index!");
            return;
        }
        this.remove(index - 1);
    }

    private void buyProductAction(){
        System.out.println("Please enter product index ...");
        int index = reader.nextInt();
        if(!isIndexValid(index)){
            System.out.println("You have entered invalid product index!");
            return;
        }
        System.out.println("Please enter product price ...");
        this.get(index - 1).buyIt(reader.nextFloat());
    }

    private void addProductAction(){
        System.out.println("Please enter product name ...");
        this.add(new ListEntry(reader.next()));
    }

    private void clearListAction(){
        this.clear();
    }

    private boolean isIndexValid(int index){
        return (index > 0 && index <= this.size());
    }



}
