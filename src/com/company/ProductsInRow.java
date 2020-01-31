package com.company;

import com.company.products.Product;

import java.util.LinkedList;

public class ProductsInRow {

    private LinkedList<ProductList> productListsInRow;

    public ProductsInRow(Product product1, Product product2, Product product3) {

        makeProductsRow(product1, product2, product3);
    }

    private LinkedList<ProductList> makeProductsRow(Product product1, Product product2, Product product3) {
        this.productListsInRow = new LinkedList<ProductList>();
        this.productListsInRow.add(new ProductList(product1));
        this.productListsInRow.add(new ProductList(product2));
        this.productListsInRow.add(new ProductList(product3));
        return productListsInRow;
    }

    public LinkedList<ProductList> getProductListsInRow() {
        return productListsInRow;
    }

    public void setProductListsInRow(LinkedList<ProductList> productListsInRow) {
        this.productListsInRow = productListsInRow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsInRow that = (ProductsInRow) o;

        return productListsInRow != null ? productListsInRow.equals(that.productListsInRow) : that.productListsInRow == null;
    }

    @Override
    public int hashCode() {
        return productListsInRow != null ? productListsInRow.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProductsInRow{" +
                "productListsInRow=" + productListsInRow +
                '}';
    }
}
