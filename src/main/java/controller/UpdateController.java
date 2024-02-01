package controller;

import model.*;
import service.UpdateService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/update")
public class UpdateController {

    @Autowired
    UpdateService service;

    @PutMapping("/travel/{travelId}")
    public ResponseEntity updateTravel(@RequestBody TravelRequest request, @PathVariable(name = "travelId") int travelId) throws Exception {
        service.updateTravel(request, travelId);
        Result<Object> response = successBuilder(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/trip/{tripId}")
    public ResponseEntity updateTrip(@RequestBody TripRequest request, @PathVariable(name = "tripId") int tripId) throws Exception {
        service.updateTrip(request, tripId);
        Result<Object> response = successBuilder(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/accommo/{accommodationId}")
    public ResponseEntity updateAccommo(@RequestBody AccommodationRequest request, @PathVariable(name = "accommodationId") int accommodationId) throws Exception {
        service.updateAccommodation(request, accommodationId);
        Result<Object> response = successBuilder(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/stay/{stayId}")
    public ResponseEntity updateStay(@RequestBody StayRequest request, @PathVariable(name = "stayId") int stayId) throws Exception {
        service.updateStay(request, stayId);
        Result<Object> response = successBuilder(request);
        return ResponseEntity.ok(response);
    }

    public Result<Object> successBuilder(Object obj) {
        return Result.builder()
                .resultCode("" + HttpStatus.OK.value())
                .resultMessage(HttpStatus.OK.getReasonPhrase())
                .data(obj)
                .build();
    }


}
