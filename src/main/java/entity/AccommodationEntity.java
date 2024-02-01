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
public class AccommodationEntity {

  private int accommodationId;
  private int tripId;
  private String accommodation;
  private LocalDateTime checkIn;
  private LocalDateTime checkOut;

  public AccommodationEntity(int tripId, String accommodation,
                             LocalDateTime checkIn, LocalDateTime checkOut){
    this.tripId = tripId;
    this.accommodation = accommodation;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }
}
