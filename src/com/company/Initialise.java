package com.company;

import com.company.products.*;

import java.util.HashMap;

public class Initialise {

    public static HashMap<String, ProductsInRow> init() {

        ProductsInRow drinks = initializeDrinks();

        ProductsInRow chocolates = initializeChocolates();

        ProductsInRow cheaps = initializeCheaps();

        HashMap<String, ProductsInRow> hashMap = new HashMap<>();

        hashMap.put("A", drinks);
        hashMap.put("B", chocolates);
        hashMap.put("C", cheaps);
        return hashMap;
    }

    public static ProductsInRow initializeDrinks() {

        ProductsInRow drinks = new ProductsInRow(new Cola(), new Fanta(), new Pepsi());

        return drinks;
    }

    private static ProductsInRow initializeChocolates() {

        ProductsInRow chocolates = new ProductsInRow(new KitKat(), new Snickers(), new Twix());

        return chocolates;
    }

    private static ProductsInRow initializeCheaps() {

        ProductsInRow cheaps = new ProductsInRow(new Lays(), new Pringles(), new Doritos());

        return cheaps;
    }

}
