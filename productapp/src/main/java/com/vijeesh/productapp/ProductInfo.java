package com.vijeesh.productapp;

public class ProductInfo {
    int productId;
    String productName;
    double price;
    Review review;

    public ProductInfo(int productId, String productName, double price, Review review) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.review = review;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
