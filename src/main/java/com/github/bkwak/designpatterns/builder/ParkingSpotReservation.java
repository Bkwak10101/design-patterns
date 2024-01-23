package com.github.bkwak.designpatterns.builder;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ParkingSpotReservation{

    private User user;
    private List<Spot> spot;
    private Vehicle vehicle;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}

