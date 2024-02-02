package controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.Result;
import model.TravelResponse;
import model.TripResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SelectService;

import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class SelectController {

    private SelectService selectService;

    @GetMapping("/travel")
    public ResponseEntity<Result<Object>> getAllTravel() {

        log.info("select getAllTravel");

        return ResponseEntity.ok(
                Result.successBuilder(selectService.getAllTravel()
                .stream()
                .map(TravelResponse::fromEntity)
                .collect(Collectors.toList()))
        );

    }

    @GetMapping("/travel/{travelId}")
    public ResponseEntity<Result<Object>> getTravelById(@PathVariable("travelId") Integer travelId) {

        log.info("select getTravelById - id : {}", travelId);

        return ResponseEntity.ok(
                Result.successBuilder(
                        TravelResponse.fromEntity(
                                selectService.getTravelById(travelId)))
        );
    }

    @GetMapping("/trip")
    public ResponseEntity<Result<Object>> getAllTrip() {

        selectService.getAllTrip().stream().map(TripResponse::fromEntity).collect(Collectors.toList());

        return ResponseEntity.ok(
                Result.successBuilder(selectService.getAllTrip()
                        .stream()
                        .map(TripResponse::fromEntity)
                        .collect(Collectors.toList())));
    }

    @GetMapping("/trip/{tripId}")
    public ResponseEntity<Result<Object>> getTrip(@PathVariable("tripId") Integer tripId) {

        TripResponse.fromEntity(selectService.getTrip(tripId));

        return ResponseEntity.ok(
                Result.successBuilder(
                        TripResponse.fromEntity(
                                selectService.getTrip(tripId)))
        );
    }
}
