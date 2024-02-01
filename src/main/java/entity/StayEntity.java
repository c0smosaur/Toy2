package entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StayEntity {

  private int stayId;
  private int tripId;
  private String address;
  private LocalDateTime arrival;
  private LocalDateTime departure;

  public StayEntity(int tripId, String address,
                    LocalDateTime departure, LocalDateTime arrival){
    this.tripId = tripId;
    this.address = address;
    this.departure = departure;
    this.arrival = arrival;
  }
}
