package com.github.bkwak.designpatterns.state;

public class AcceptedVehicleState implements VehicleState {

    @Override
    public void doAction(ProcessContext processContext) {
        System.out.println("Pojazd został przyjęty do warsztatu.");
        processContext.setState(this);
    }

    @Override
    public String toString() {
        return "Przyjęcie pojazdu";
    }
}
