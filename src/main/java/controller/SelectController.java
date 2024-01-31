package controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.TravelResponse;
import model.TripResponse;
import org.springframework.web.bind.annotation.*;
import service.TravelService;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/select")
@AllArgsConstructor
public class SelectController {

    private TravelService travelService;

    @GetMapping("")
    public String test() {
        return "hello select";
    }

    @GetMapping("/alltravel")
    public List<TravelResponse> getAllTravel() {

        log.info("select getAllTrip");

        return travelService.getAllTravel()
                .stream()
                .map(TravelResponse::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/travel/{travelId}")
    public TravelResponse getTravelById(@PathVariable("travelId")Integer travelId) {

        log.info("select getTravelById");

        return TravelResponse.fromEntity(travelService.getTravelById(travelId));
    }
}
