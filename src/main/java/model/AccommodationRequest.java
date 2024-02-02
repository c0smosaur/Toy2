package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import entity.AccommodationEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccommodationRequest {
  private int accommodationId;
  private String accommodation;
  private LocalDateTime checkIn;
  private LocalDateTime checkOut;

  public AccommodationEntity fromDTO(AccommodationRequest request, int tripId){
    return AccommodationEntity.builder()
            .tripId(tripId)
            .accommodation(request.accommodation)
            .checkIn(request.checkIn)
            .checkOut(request.checkOut)
            .build();
  }
}
