package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import entity.StayEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StayRequest {
  private int stayId;
  private String address;
  private LocalDateTime arrival;
  private LocalDateTime departure;

  public StayEntity fromDTO(StayRequest request, int tripId){
    return StayEntity.builder()
            .stayId(request.stayId)
            .tripId(tripId)
            .address(request.address)
            .arrival(request.arrival)
            .departure(request.departure)
            .build();
  }
}
