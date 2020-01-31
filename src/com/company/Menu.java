package com.company;

public abstract class Menu {

    public static void displayMenu(VendingMachine vendingMachine) {
        for (int i = 0; i < 3; i++) {
            System.out.println("A" + ":" + (i + 1) + " : " + vendingMachine.getHashMap().get("A").getProductListsInRow().get(i).getProductList().peekFirst() +
                    " : " + vendingMachine.getHashMap().get("A").getProductListsInRow().get(i).getProductList().size());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("B" + ":" + (i + 1) + " : " + vendingMachine.getHashMap().get("B").getProductListsInRow().get(i).getProductList().peekFirst() +
                    " : " + vendingMachine.getHashMap().get("B").getProductListsInRow().get(i).getProductList().size());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("C" + ":" + (i + 1) + " : " + vendingMachine.getHashMap().get("C").getProductListsInRow().get(i).getProductList().peekFirst() +
                    " : " + vendingMachine.getHashMap().get("C").getProductListsInRow().get(i).getProductList().size());
        }
    }

}
