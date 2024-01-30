package model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TripResponse {

  private int tripId;
  private String transportation;
  private String startpoint;
  private String endpoint;
  private LocalDateTime departureTime;
  private LocalDateTime arrivalTime;

}