package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;

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

    public void deleteTravel(int travelId) {
    }

    public void deleteTrip(int tripId) {
    }

    public void deleteAccommodation(int accommodationId) {
    }

    public void deleteStay(int stayId) {
    }
}
