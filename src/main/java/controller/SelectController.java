package controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.Result;
import model.TravelResponse;
import model.TripResponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.SelectService;
import service.TravelService;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/select")
@AllArgsConstructor
public class SelectController {

    private SelectService selectService;

    @GetMapping("")
    public String test() {
        return "hello select";
    }

    @GetMapping("/travel")
    public List<TravelResponse> getAllTravel() {

        log.info("select getAllTrip");

        return selectService.getAllTravel()
                .stream()
                .map(TravelResponse::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/travel/{travelId}")
    public TravelResponse getTravelById(@PathVariable("travelId")Integer travelId) {

        log.info("select getTravelById - id : {}", travelId);

        return TravelResponse.fromEntity(selectService.getTravelById(travelId));
    }

    @GetMapping("/trip")
    public TripResponse getAllTrip() {

        return  TripResponse.fromEntity(selectService.getAllTrip());
    }
}
