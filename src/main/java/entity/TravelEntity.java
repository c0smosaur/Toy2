package entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
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
public class TravelEntity {

  private int travelId;
  private String travelName;
  private LocalDateTime departure;
  private LocalDateTime arrival;
  private String overseas;

  public TravelEntity(String travelName, LocalDateTime departure,
                      LocalDateTime arrival, String overseas){
    this.travelName = travelName;
    this.departure = departure;
    this.arrival = arrival;
    this.overseas = overseas;
  }
}