package model;

import entity.TravelEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TravelRequest {

  private int travelId;
  private String travelName;
  private LocalDateTime departure;
  private LocalDateTime arrival;
  private String overseas;

  public TravelEntity fromDTO(TravelRequest request){
    // dto to entity
    return TravelEntity.builder()
            .travelId(request.travelId)
            .travelName(request.travelName)
            .departure(request.departure)
            .arrival(request.arrival)
            .overseas(request.overseas)
            .build();
  }
}