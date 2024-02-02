package controller;

import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;
import service.InsertService;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/insert")
public class InsertController {

  @Autowired
  InsertService service;

  // 여행 입력
  @PostMapping("/travel")
  public ResponseEntity insertTravel(@RequestBody TravelRequest request) throws Exception{
    int count = service.insertTravel(request);
    Result<Object> response = successBuilder(request);
    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

  // 여정(이동, 단수) 입력
  @PostMapping("/trip/{travelId}")
  public ResponseEntity insertTrip(@RequestBody TripRequest request,
                                   @PathVariable(name="travelId") int travelId) throws Exception{
    int count = service.insertTrip(request, travelId);
    Result<Object> response = successBuilder(request);
    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

  // 여정(이동, 복수) 입력
  // request 는 trip_id, travel_id가 0으로 들어가서 db 안에서 AI로 받음
  @PostMapping("/trip-list/{travelId}")
  public ResponseEntity insertTripList(@RequestBody List<TripRequest> requests,
                                       @PathVariable(name="travelId") int travelId) throws Exception{
    int count = 0;
    for(TripRequest request:requests){
      count += service.insertTrip(request, travelId);
    }
    Result<Object> response = successBuilder(requests);
    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

  // 여정(숙박, 단수) 입력
  @PostMapping("/accommodation/{tripId}")
  public ResponseEntity insertAccommo(@RequestBody AccommodationRequest request,
                           @PathVariable(name="tripId") int tripId) throws Exception{
    int count = service.insertAccommodation(request, tripId);
    Result<Object> response = successBuilder(request);
    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

  // 여정(숙박, 복수) 입력
  @PostMapping("/accommodation-list/{tripId}")
  public ResponseEntity insertAccommoList(@RequestBody List<AccommodationRequest> requests,
                                          @PathVariable(name="tripId") int tripId) throws Exception{
    int count = 0;
    for (AccommodationRequest request:requests){
      count += service.insertAccommodation(request, tripId);
    }
    Result<Object> response = successBuilder(requests);
    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

  // 여정(체류, 단수) 입력
  @PostMapping("/stay/{tripId}")
  public ResponseEntity insertStay(@RequestBody StayRequest request,
                        @PathVariable(name = "tripId") int tripId) throws Exception{
    int count = service.insertStay(request, tripId);
    Result<Object> response = successBuilder(request);
    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

  // 여정(체류, 복수) 입력
  @PostMapping("/stay-list/{tripId}")
  public ResponseEntity insertStay(@RequestBody List<StayRequest> requests,
                                   @PathVariable(name = "tripId") int tripId) throws Exception{
    int count = 0;
    for (StayRequest request: requests){
      count+=service.insertStay(request, tripId);
    }
    Result<Object> response = successBuilder(requests);
    return ResponseEntity.status(HttpStatus.OK).body(response);
  }

  public Result<Object> successBuilder(Object obj){
    return Result.builder()
            .resultCode(""+HttpStatus.OK.value())
            .resultMessage(HttpStatus.OK.getReasonPhrase())
            .data(obj)
            .build();
  }
}
