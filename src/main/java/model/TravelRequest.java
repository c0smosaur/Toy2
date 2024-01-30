package model;

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
}
