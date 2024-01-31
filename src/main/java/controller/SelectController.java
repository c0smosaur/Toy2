package controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.TravelResponse;
import model.TripResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
        System.out.println("select getAllTrip");


        return travelService.getAllTravel();
    }
}
