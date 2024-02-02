package com.github.bkwak.designpatterns.facade;

public class Main {

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("ABC123", "Karta kredytowa", 99.99);
        orderFacade.removeProduct("ABC123");
    }
}