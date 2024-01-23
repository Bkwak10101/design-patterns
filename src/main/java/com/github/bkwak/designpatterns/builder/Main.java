package com.github.bkwak.designpatterns.builder;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Spot spot = new Spot(11, true);
        Spot spot2 = new Spot(12, true);
        Spot spot3 = new Spot(13, true);
        Spot spot4 = new Spot(14, true);


        new ParkingSpotReservation();
        ParkingSpotReservation reservation1 = ParkingSpotReservation.builder()
                .user(new User("Jan", "Kowalski", "123321312", "jankowalski@gmail.com"))
                .spot(List.of(spot, spot2))
                .vehicle(new Vehicle("KR123123", VehicleType.CAR))
                .startDate(LocalDateTime.of(2024, 1, 23, 10, 0))
                .endDate(LocalDateTime.of(2024, 1, 23, 13, 0))
                .build();

        System.out.println(reservation1);
        spot.setAvailability(false);
        spot2.setAvailability(false);

        ParkingSpotReservation reservation2 = ParkingSpotReservation.builder()
                .user(new User("Anna", "Nowak", "312333312", "annanowak@gmail.com"))
                .spot(List.of(spot3, spot4))
                .vehicle(new Vehicle("KR123123", VehicleType.MOTORCYCLE))
                .startDate(LocalDateTime.of(2024, 1, 23, 10, 0))
                .endDate(LocalDateTime.of(2024, 1, 23, 12, 0))
                .build();

        System.out.println(reservation2);
    }
}
