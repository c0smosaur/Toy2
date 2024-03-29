package service;

import entity.TravelEntity;
import entity.TripEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.TravelMapper;
import repository.TripMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class SelectService {

    private TravelMapper travelMapper;
    private TripMapper tripMapper;

    // TODO : 전역 예외처리 Optional 활용해 추가 예정
    @Transactional
    public List<TravelEntity> getAllTravel() {

        List<TravelEntity> allTravel = travelMapper.getAllTravel();

        return allTravel;
    }

    @Transactional
    public TravelEntity getTravelById(Integer travelId) {

        return travelMapper.getTravelById(travelId)
                .orElseThrow(IllegalArgumentException::new);
    }

    @Transactional
    public List<TripEntity> getAllTrip() {

        List<TripEntity> allTrip = tripMapper.getAllTrip();

        return allTrip;
    }

    @Transactional
    public TripEntity getTrip(Integer tripId) {

        return tripMapper.getTrip(tripId)
                .orElseThrow(IllegalArgumentException::new);
    }
}
