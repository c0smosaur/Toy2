package entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TripEntity {

  private int tripId;
  private int travelId;
  private String transportation;
  private String startpoint;
  private String endpoint;
  private LocalDateTime departureTime;
  private LocalDateTime arrivalTime;

  public TripEntity(int travelId, String transportation,
                    String startpoint, String endpoint,
                    LocalDateTime departureTime, LocalDateTime arrivalTime){
    this.travelId = travelId;
    this.transportation = transportation;
    this.startpoint = startpoint;
    this.endpoint = endpoint;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
  }
}