package com.arka99.designpatterns.abstractfactory;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        String order;
        Scanner scanner = new Scanner(System.in);
        boolean state = true;


        while (state) {
            System.out.println("Enter which snack you want to eat. Type cancel to finish your order");
            System.out.print("Burger or Pizza: ");
            order = scanner.next();
            if (order.equalsIgnoreCase("cancel")) {
                System.out.println("Thanks for paying visit to our shop");
                break;
            } else {
                try {
                    SnackFactory factory = SnackMachine.getFactory(order);
                    System.out.println("Please enter which variant you want to try");
                    System.out.print("Chicken or Cheese? : ");
                    order = scanner.next();
                    Snack snack = factory.getSnack(order);
                    snack.prepare();
                    snack.serve();

                } catch (NullPointerException e) {
                    System.out.println("Not available. Please try again.");
                }
            }


        }

    }
}

