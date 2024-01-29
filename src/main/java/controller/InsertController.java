package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import entity.AccommodationEntity;
import entity.StayEntity;
import entity.TravelEntity;
import entity.TripEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;

@RestController
@RequestMapping("/create")
public class InsertController {

  @Autowired
  private TravelMapper travelMapper;
  @Autowired
  private TripMapper tripMapper;
  @Autowired
  private AccommodationMapper accMapper;
  @Autowired
  private StayMapper stayMapper;

  ObjectMapper objectMapper = new ObjectMapper();

  @RequestMapping("/")
  public String test(){
    System.out.println("hello");
    return "{\"test\":\"test\"}";
  }

  @PostMapping("/travel")
  public Integer insertTravel(@RequestBody TravelEntity travel) throws Exception{
    objectMapper.registerModule(new JavaTimeModule());
    System.out.println(travel);
    int count = travelMapper.insertTravel(travel);
    return count;
  }

  @PostMapping("/trip")
  public Integer insertTrip(@RequestBody TripEntity trip) throws Exception{
    objectMapper.registerModule(new JavaTimeModule());
    System.out.println(trip);
    int count = tripMapper.insertTrip(trip);
    return count;

  }

  @PostMapping("/accommo")
  public int insertAccommo(@RequestBody AccommodationEntity accommo) throws Exception{
    objectMapper.registerModule(new JavaTimeModule());
    System.out.println(accommo);
    int count = accMapper.insertAccommodation(accommo);
    return count;
  }

  @PostMapping("/stay")
  public int insertStay(@RequestBody StayEntity stay){
    objectMapper.registerModule(new JavaTimeModule());
    System.out.println(stay);
    int count = stayMapper.insertStay(stay);
    return count;
  }
}
