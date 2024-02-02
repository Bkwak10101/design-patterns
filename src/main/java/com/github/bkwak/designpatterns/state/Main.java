package com.github.bkwak.designpatterns.state;

import com.github.bkwak.designpatterns.state.*;

public class Main {

    public static void main(String[] args) {
        ProcessContext context = new ProcessContext();

        VehicleState acceptedState = new AcceptedVehicleState();
        acceptedState.doAction(context);
        System.out.println("Aktualny stan: " + context.getState());

        VehicleState diagnosingState = new DiagnosingVehicleState();
        diagnosingState.doAction(context);
        System.out.println("Aktualny stan: " + context.getState());

        VehicleState repairingState = new RepairingVehicleState();
        repairingState.doAction(context);
        System.out.println("Aktualny stan: " + context.getState());

        VehicleState finishedState = new FinishedVehicleState();
        finishedState.doAction(context);
        System.out.println("Aktualny stan: " + context.getState());
    }
}
