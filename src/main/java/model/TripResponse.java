package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import entity.AccommodationEntity;
import entity.StayEntity;
import entity.TripEntity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
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
    private AccommodationResponse accommodation;
    private List<StayResponse> stay = new ArrayList<>();

    public static TripResponse fromEntity(TripEntity tripEntity) {

        List<StayResponse> responses = Collections.emptyList();
        if (tripEntity.getStay() != null) {
            responses = tripEntity.getStay().stream()
                    .map(StayResponse::fromEntity)
                    .collect(Collectors.toList());
        }

        AccommodationResponse accommodationResponse = null;
        if (tripEntity.getAccommodation() != null) {
            accommodationResponse = AccommodationResponse.fromEntity(tripEntity.getAccommodation());
        }

        return TripResponse.builder()
                .tripId(tripEntity.getTripId())
                .transportation(tripEntity.getTransportation())
                .startpoint(tripEntity.getStartpoint())
                .endpoint(tripEntity.getEndpoint())
                .departureTime(tripEntity.getDepartureTime())
                .arrivalTime(tripEntity.getArrivalTime())
                .stay(responses)
                .accommodation(accommodationResponse)
                .build();
    }
}
