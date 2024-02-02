package com.github.bkwak.designpatterns.facade;

class PaymentSubsystem {

    public void processPayment(String paymentMethod, double amount) {
        System.out.println("Przetwarzanie płatności " + amount + " za pomocą metody " + paymentMethod);
    }
}
