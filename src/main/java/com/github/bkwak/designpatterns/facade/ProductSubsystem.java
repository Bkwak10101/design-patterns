package com.github.bkwak.designpatterns.facade;

class ProductSubsystem {

    public void addProductToCart(String productId) {
        System.out.println("Dodano produkt o ID " + productId + " do koszyka");
    }

    public void removeProductFromCart(String productId) {
        System.out.println("Usunięto produkt o ID " + productId + " z koszyka");
    }
}
