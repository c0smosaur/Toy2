package service;

import entity.TravelEntity;
import entity.TripEntity;
import model.TravelResponse;
import model.TripResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TravelService {

    @Autowired
    private AccommodationMapper accommodationMapper;
    @Autowired
    private StayMapper stayMapper;
    @Autowired
    private TravelMapper travelMapper;
    @Autowired
    private TripMapper tripMapper;

    // TODO : 전역 예외처리 Optional 활용해 추가 예정
    @Transactional
    public List<TravelEntity> getAllTravel() {

        List<TravelEntity> allTrip = travelMapper.getAllTravel();

        System.out.println("allTrip = " + allTrip);

        return allTrip;
    }

    @Transactional
    public TravelEntity getTravelById(Integer travelId) {

        return travelMapper.getTravelById(travelId);
    }

    public void deleteTravel(int travelId) {
    }

    public void deleteTrip(int tripId) {
    }

    public void deleteAccommodation(int accommodationId) {
    }

    public void deleteStay(int stayId) {
    }

}
