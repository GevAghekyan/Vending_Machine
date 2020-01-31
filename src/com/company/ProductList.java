package com.company;

import com.company.products.Product;

import java.util.LinkedList;

public class ProductList {

    private LinkedList<Product> productList;

    public ProductList(Product product) {
        makeProductList(product);
    }

    private LinkedList<Product> makeProductList(Product product) {
        this.productList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            this.productList.add(product);
        }
        return productList;
    }

    public LinkedList<Product> getProductList() {
        return productList;
    }

    public void setProductList(LinkedList<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductList that = (ProductList) o;

        return productList != null ? productList.equals(that.productList) : that.productList == null;
    }

    @Override
    public int hashCode() {
        return productList != null ? productList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productList=" + productList +
                '}';
    }
}
