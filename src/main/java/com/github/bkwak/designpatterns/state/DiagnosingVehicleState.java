package com.github.bkwak.designpatterns.state;

public class DiagnosingVehicleState implements VehicleState {

    @Override
    public void doAction(ProcessContext processContext) {
        System.out.println("Diagnoza problemu pojazdu w toku...");
        processContext.setState(this);
    }

    @Override
    public String toString() {
        return "Diagnoza";
    }
}
