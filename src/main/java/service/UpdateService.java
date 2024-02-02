package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import entity.AccommodationEntity;
import entity.StayEntity;
import entity.TravelEntity;
import entity.TripEntity;
import model.AccommodationRequest;
import model.StayRequest;
import model.TravelRequest;
import model.TripRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;

import java.util.HashMap;
import java.util.Map;

@Service
public class UpdateService {

  @Autowired
  private TravelMapper travelMapper;
  @Autowired
  private TripMapper tripMapper;
  @Autowired
  private AccommodationMapper accMapper;
  @Autowired
  private StayMapper stayMapper;

  public int updateTravel(TravelRequest request, int travelId) throws Exception {
    if (!request.getTravelName().isBlank()&&!request.getOverseas().isBlank()){
      Map map = new HashMap();
      map.put("request", request);
      map.put("travelId", travelId);
      return travelMapper.updateTravel(map);
    } else throw new IllegalArgumentException();
  }

  public int updateTrip(TripRequest request, int tripId) throws Exception {
    if (!request.getEndpoint().isBlank()&&
            !request.getTransportation().isBlank()&&
            !request.getEndpoint().isBlank()) {
      Map map = new HashMap();
      map.put("request", request);
      map.put("tripId", tripId);
      return tripMapper.updateTrip(map);
    } else throw new IllegalArgumentException();
  }

  public int updateAccommodation(AccommodationRequest request, int accommodationId) throws Exception {
    if (!request.getAccommodation().isBlank()) {
      Map map = new HashMap();
      map.put("request", request);
      map.put("accommodationId", accommodationId);
      return accMapper.updateAccommodation(map);
    } else throw new IllegalArgumentException();
  }

  public int updateStay(StayRequest request, int stayId) throws Exception {
    if (!request.getAddress().isBlank()) {
      Map map = new HashMap();
      map.put("request", request);
      map.put("stayId", stayId);
      return stayMapper.updateStay(map);
    } else throw new IllegalArgumentException();
  }
}