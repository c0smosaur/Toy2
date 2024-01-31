package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import entity.TripEntity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TripResponse {

    private int tripId;
    private String transportation;
    private String startpoint;
    private String endpoint;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public static TripResponse fromEntity(TripEntity tripEntity) {
        return TripResponse.builder()
                .tripId(tripEntity.getTripId())
                .transportation(tripEntity.getTransportation())
                .startpoint(tripEntity.getStartpoint())
                .endpoint(tripEntity.getEndpoint())
                .departureTime(tripEntity.getDepartureTime())
                .arrivalTime(tripEntity.getArrivalTime())
                .build();
    }

}
