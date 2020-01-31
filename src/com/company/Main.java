package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.displayMenu(vendingMachine);
            System.out.println("Enter product code:");
            String input = scanner.nextLine();
            try {
                System.out.println(vendingMachine.giveProduct(Converter.convertInputToCommand(input)));
            }catch (NullPointerException ex) {
                System.out.println("INCORRECT PRODUCT CODE!!!");
            }catch (IndexOutOfBoundsException ex) {
                System.out.println("INCORRECT PRODUCT CODE!!!");
            }
        }
    }
}
