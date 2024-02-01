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
  ObjectMapper objectMapper = new ObjectMapper();

  public int updateTravel(TravelRequest request, int travelId) throws Exception {
    TravelEntity entity = request.fromDTO(request);
    entity.setTravelId(travelId);
    return travelMapper.updateTravel(entity);
  }

  public int updateTrip(TripRequest request, int tripId) throws Exception {
//    TripEntity entity = request.fromDTO(request, tripId);
//    entity.setTripId(tripId);
    Map map = new HashMap();
    map.put("request", request);
    map.put("tripId",tripId);
    return tripMapper.updateTrip(map);
  }

  public int updateAccommodation(AccommodationRequest request, int accommodationId) throws Exception {
//    AccommodationEntity entity = request.fromDTO(request, accommodationId);
//    entity.setAccommodationId(accommodationId);
    Map map = new HashMap();
    map.put("request",request);
    map.put("accommodationId", accommodationId);
    return accMapper.updateAccommodation(map);
  }

  public int updateStay(StayRequest request, int stayId) throws Exception {
//    StayEntity entity = request.fromDTO(request, stayId);
//    entity.setStayId(stayId);
    Map map = new HashMap();
    map.put("request", request);
    map.put("stayId", stayId);
    return stayMapper.updateStay(map);
  }
}