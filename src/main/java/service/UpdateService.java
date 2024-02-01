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
        objectMapper.registerModule(new JavaTimeModule());
        TravelEntity entity = request.fromDTO(request);
        return travelMapper.updateTravel(entity);
    }

    public int updateTrip(TripRequest request, int tripId) throws Exception {
        objectMapper.registerModule(new JavaTimeModule());
        TripEntity entity = request.fromDTO(request, tripId);
        return tripMapper.updateTrip(entity);
    }

    public int updateAccommodation(AccommodationRequest request, int accommodationId) throws Exception {
        objectMapper.registerModule(new JavaTimeModule());
        AccommodationEntity entity = request.fromDTO(request, accommodationId);
        return accMapper.updateAccommodation(entity);
    }

    public int updateStay(StayRequest request, int stayId) throws Exception {
        objectMapper.registerModule(new JavaTimeModule());
        StayEntity entity = request.fromDTO(request, stayId);
        return stayMapper.updateStay(entity);
    }
}
