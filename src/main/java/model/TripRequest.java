package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import entity.TripEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TripRequest {

  private int tripId;
  private String transportation;
  private String startpoint;
  private String endpoint;
  private LocalDateTime departureTime;
  private LocalDateTime arrivalTime;

  public TripEntity fromDTO(TripRequest request, int travelId){
    return TripEntity.builder()
            .tripId(request.tripId)
            .travel_id(travelId)
            .transportation(request.transportation)
            .startpoint(request.startpoint)
            .endpoint(request.endpoint)
            .departureTime(request.departureTime)
            .arrivalTime(request.arrivalTime)
            .build();
  }
}
