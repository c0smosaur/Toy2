package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TravelEntity {

  @JsonProperty("travel_id")
  private int travelId;

  @JsonProperty("travel_name")
  private String travelName;
  private LocalDateTime departure;
  private LocalDateTime arrival;
  private String overseas;
  private List<TripEntity> trip = new ArrayList<>();

  public TravelEntity(String travelName, LocalDateTime departure,
                      LocalDateTime arrival, String overseas){
    this.travelName = travelName;
    this.departure = departure;
    this.arrival = arrival;
    this.overseas = overseas;
  }
}
