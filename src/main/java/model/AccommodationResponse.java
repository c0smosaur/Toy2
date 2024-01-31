package model;

import entity.AccommodationEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AccommodationResponse {

    private int accommodationId;
    private String accommodation;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public static AccommodationResponse fromEntity
            (
                    AccommodationEntity accommodationEntity
            ) {

        return AccommodationResponse.builder()
                .accommodationId(accommodationEntity.getAccommodationId())
                .accommodation(accommodationEntity.getAccommodation())
                .checkIn(accommodationEntity.getCheckIn())
                .checkOut(accommodationEntity.getCheckOut())
                .build();
    }
}
