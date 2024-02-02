package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;

import java.util.NoSuchElementException;

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
  public int deleteTravel(int travelId) throws Exception {
    int count = travelMapper.deleteTravel(travelId);
    if (count==1) return count;
    else throw new NoSuchElementException();
  }

  public int deleteTrip(int tripId) throws Exception {
    int count = tripMapper.deleteTrip(tripId);
    if (count==1) return count;
    else throw new NoSuchElementException();
  }

  public int deleteAccommodation(int accommodationId) throws Exception {
    int count = accommodationMapper.deleteAccommodation(accommodationId);
    if (count==1) return count;
    else throw new NoSuchElementException();
  }

  public int deleteStay(int stayId) throws Exception {
    int count = stayMapper.deleteStay(stayId);
    if (count==1) return count;
    else throw new NoSuchElementException();
  }
}
