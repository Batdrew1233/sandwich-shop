package com.plurasight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // Ask user for sandwich option
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What size sandwich do you want (1 or 2):");
        System.out.println("1: Regular: base price $5.45");
        System.out.println(("2: Large: Base price $8.95"));
        System.out.print("Pick: ");
        double sandwhichNumber = myScanner.nextInt();
        if (sandwhichNumber == 1){
            sandwhichNumber = 5.45;
        }else {
            sandwhichNumber = 8.95;
        }
        myScanner.nextLine();

        //Ask user how old they are
        System.out.print("How old are you?: ");
        int yourAge = myScanner.nextInt();
        // Calculate discount
        double tenPercent = sandwhichNumber * 0.1;
        double twentyPercent = sandwhichNumber * 0.2;

        //If statement
        if (yourAge <= 17){
            double totalPurchase = sandwhichNumber - tenPercent;
            String formattedTotalPurchase = String.format("%.2f", totalPurchase);
            System.out.println("10% discount applied.");
            System.out.println("Your total is $" + formattedTotalPurchase);
        }else if (yourAge >= 65){
            double totalPurchase = sandwhichNumber - twentyPercent;
            String formattedTotalPurchase = String.format("%.2f", totalPurchase);
            System.out.println("20% discount applied.");
            System.out.println("Your total is $" + formattedTotalPurchase);
        }else {
            double totalPurchase = sandwhichNumber;
            System.out.println("No discount applied.");
            System.out.println("Your total is $" + totalPurchase);
        }

        myScanner.close();



    }
}
