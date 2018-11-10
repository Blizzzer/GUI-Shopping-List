package com;

import java.util.Scanner;

public class PrinterLibrary {
    public static void separator() {
        System.out.println("--------------------------------");
        System.out.println();
    }

    public static void welcomeToShoppingList() {
        System.out.println("Hello to our shopping list!");
        PrinterLibrary.separator();
    }

    public static int shoppingListMenu(Scanner reader) {
        System.out.println("1. Show list");
        System.out.println("2. Delete product");
        System.out.println("3. Buy product");
        System.out.println("4. Add product");
        System.out.println("5. Clear list");
        System.out.println("6. Quit");

        System.out.println("What you want to do?");
        return reader.nextInt();
    }

    public static int inputProductIndex(Scanner reader) {
        System.out.println("Please enter product index ...");
        return reader.nextInt();
    }

    public static String inputProductName(Scanner reader) {
        System.out.println("Please enter product name ...");
        return reader.next();
    }

    public static void wrongDecision(){
        System.out.println("Your answer is invalid");
    }
}
