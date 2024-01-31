package entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TripEntity {

  private int tripId;
  private int travel_id;
  private String transportation;
  private String startpoint;
  private String endpoint;
  private LocalDateTime departureTime;
  private LocalDateTime arrivalTime;
}
