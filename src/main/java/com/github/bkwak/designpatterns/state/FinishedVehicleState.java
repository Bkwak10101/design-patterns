package com.github.bkwak.designpatterns.state;

public class FinishedVehicleState implements VehicleState {

    @Override
    public void doAction(ProcessContext processContext) {
        System.out.println("Praca zakończona. Pojazd gotowy do odbioru.");
        processContext.setState(this);
    }

    @Override
    public String toString() {
        return "Zakończenie";
    }
}
