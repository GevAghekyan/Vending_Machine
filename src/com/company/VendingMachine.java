package com.company;

import com.company.products.Product;

import java.util.HashMap;

public class VendingMachine {

    private HashMap<String, ProductsInRow> hashMap;

    public VendingMachine() {

        this.hashMap = Initialise.init();

    }

    public Product giveProduct(Command command) {

        Product product = this.hashMap.get(command.getLine()).getProductListsInRow().get(command.getColumn()).getProductList().peek();
        if (this.hashMap.get(command.getLine()).getProductListsInRow().get(command.getColumn()).getProductList().peek() != null) {
            this.hashMap.get(command.getLine()).getProductListsInRow().get(command.getColumn()).getProductList().removeFirst();
        }
        return product;
    }

    public HashMap<String, ProductsInRow> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, ProductsInRow> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VendingMachine that = (VendingMachine) o;

        return hashMap != null ? hashMap.equals(that.hashMap) : that.hashMap == null;
    }

    @Override
    public int hashCode() {
        return hashMap != null ? hashMap.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "hashMap=" + hashMap +
                '}';
    }
}
