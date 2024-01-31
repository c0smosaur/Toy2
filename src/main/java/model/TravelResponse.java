package model;

import entity.TravelEntity;
import entity.TripEntity;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TravelResponse {

    private int travelId;
    private String travelName;
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private String overseas;
    private List<TripResponse> trip;

    public static TravelResponse fromEntity(TravelEntity travelEntity) {
//        if (travelEntity == null) {
//            return null;
//        }
//
//        List<TripResponse> tripResponses = Collections.emptyList();
//        if (travelEntity.getTrip() != null) {
//            tripResponses = travelEntity.getTrip().stream()
//                    .map(TripResponse::fromEntity)
//                    .collect(Collectors.toList());
//        }

        return TravelResponse.builder()
                .travelId(travelEntity.getTravelId())
                .travelName(travelEntity.getTravelName())
                .arrival(travelEntity.getArrival())
                .overseas(travelEntity.getOverseas())
//                .trip(tripResponses)
                .build();
    }
}
