package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;
import service.TravelService;

@RestController
public class DeleteController {
    @Autowired
    private TravelMapper travelMapper;
    @Autowired
    private TripMapper tripMapper;
    @Autowired
    private AccommodationMapper accommodationMapper;
    @Autowired
    private StayMapper stayMapper;

    @RequestMapping("/delete")
    public String delete(){
        return "Hello from delete!";
    }

    @DeleteMapping("/delete/travel/{id}")
    public String deleteTravel(@PathVariable int id) {
        travelMapper.deleteTravel(id);
        return "Travel has been deleted!";
    }

    @DeleteMapping("/delete/trip/{id}")
    public String deleteTrip(@PathVariable int id) {
        tripMapper.deleteTrip(id);
        return "Trip has been deleted!";
    }
    @DeleteMapping("/delete/accommodation/{id}")
    public String deleteAccommodation(@PathVariable int id) {
        accommodationMapper.deleteAccommodation(id);
        return "Accommodation has been deleted!";
    }

    @DeleteMapping("/delete/stay/{id}")
    public String deleteStay(@PathVariable int id) {
        stayMapper.deleteStay(id);
        return "Stay has been deleted!";
    }
}
