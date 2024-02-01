package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;

@Service
public class DeleteService {
  @Autowired
  private AccommodationMapper accommodationMapper;
  @Autowired
  private StayMapper stayMapper;
  @Autowired
  private TravelMapper travelMapper;
  @Autowired
  private TripMapper tripMapper;
  public void deleteTravel(int travelId) {
    travelMapper.deleteTravel(travelId);
  }

  public void deleteTrip(int tripId) {
    tripMapper.deleteTrip(tripId);
  }

  public void deleteAccommodation(int accommodationId) {
    accommodationMapper.deleteAccommodation(accommodationId);
  }

  public void deleteStay(int stayId) {
    stayMapper.deleteStay(stayId);
  }
}
