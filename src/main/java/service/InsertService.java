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

@Service
public class InsertService {

  @Autowired
  private TravelMapper travelMapper;
  @Autowired
  private TripMapper tripMapper;
  @Autowired
  private AccommodationMapper accMapper;
  @Autowired
  private StayMapper stayMapper;

  public int insertTravel(TravelRequest request) throws Exception{
    TravelEntity entity = request.fromDTO(request);
    return travelMapper.insertTravel(entity);
  }

  public int insertTrip(TripRequest request, int travelId) throws Exception{
    TripEntity entity = request.fromDTO(request, travelId);
    return tripMapper.insertTrip(entity);
  }

  public int insertAccommodation(AccommodationRequest request, int tripId) throws Exception{
    AccommodationEntity entity = request.fromDTO(request, tripId);
    return accMapper.insertAccommodation(entity);
  }
  public int insertStay(StayRequest request, int tripId) throws Exception{
    StayEntity entity = request.fromDTO(request, tripId);
    return stayMapper.insertStay(entity);
  }

}
