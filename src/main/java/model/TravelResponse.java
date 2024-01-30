package model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TravelResponse {

  private int travelId;
  private String travelName;
  private LocalDateTime departure;
  private LocalDateTime arrival;
  private String overseas;
}