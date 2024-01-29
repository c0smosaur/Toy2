package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import entity.TravelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.TravelMapper;

@RestController
@RequestMapping("/create")
public class InsertController {

  @Autowired
  private TravelMapper travelMapper;
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

//  @PostMapping("/trip")
//  public String insertTrip(){
//
//  }
//
//  @PostMapping("/accommo")
//  public String insertAccommo(){
//
//  }
//
//  @PostMapping("/stay")
//  public String insertStay(){
//
//  }
}
