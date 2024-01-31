package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TripRequest {

    private int tripId;
    private String transportation;
    private String startpoint;
    private String endpoint;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

}
