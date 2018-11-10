package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ShoppingList shoppingList = new ShoppingList(reader);

        PrinterLibrary.welcomeToShoppingList();
        while(shoppingList.dispatchAction(PrinterLibrary.shoppingListMenu(reader))){}

        reader.close();
    }
}
