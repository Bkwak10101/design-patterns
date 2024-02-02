package com.github.bkwak.designpatterns.state;

public class ProcessContext {

    private VehicleState vehicleState;

    public void setState(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }

    public VehicleState getState() {
        return vehicleState;
    }
}
