package com.github.bkwak.designpatterns.facade;

class OrderFacade {

    private ProductSubsystem productSubsystem;
    private PaymentSubsystem paymentSubsystem;

    public OrderFacade() {
        this.productSubsystem = new ProductSubsystem();
        this.paymentSubsystem = new PaymentSubsystem();
    }

    public void placeOrder(String productId, String paymentMethod, double amount) {
        System.out.println("Rozpoczęcie składania zamówienia");
        productSubsystem.addProductToCart(productId);
        paymentSubsystem.processPayment(paymentMethod, amount);
        System.out.println("Zamówienie złożone pomyślnie");
    }

    public void removeProduct(String productId) {
        productSubsystem.removeProductFromCart(productId);
    }
}
