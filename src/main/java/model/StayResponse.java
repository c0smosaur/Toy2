package model;

import entity.StayEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StayResponse {

    private int stayId;
    private String address;
    private LocalDateTime arrival;
    private LocalDateTime departure;

    public static StayResponse fromEntity(StayEntity stayEntity) {
        return StayResponse.builder()
                .stayId(stayEntity.getStayId())
                .address(stayEntity.getAddress())
                .arrival(stayEntity.getArrival())
                .departure(stayEntity.getDeparture())
                .build();
    }
}
