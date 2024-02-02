package com.github.bkwak.designpatterns.state;

public class RepairingVehicleState implements VehicleState {

    @Override
    public void doAction(ProcessContext processContext) {
        System.out.println("Naprawa pojazdu w toku...");
        processContext.setState(this);
    }

    @Override
    public String toString() {
        return "Naprawa";
    }
}
