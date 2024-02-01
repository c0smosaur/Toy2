package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;
import service.DeleteService;

@RestController
public class DeleteController {
    @Autowired
    private DeleteService service;

    @RequestMapping("/delete")
    public String delete(){
        return "Hello from delete!";
    }

    @DeleteMapping("/delete/travel/{id}")
    public String deleteTravel(@PathVariable int id) {
        service.deleteTravel(id);
        return "Travel has been deleted!";
    }

    @DeleteMapping("/delete/trip/{id}")
    public String deleteTrip(@PathVariable int id) {
        service.deleteTrip(id);
        return "Trip has been deleted!";
    }
    @DeleteMapping("/delete/accommodation/{id}")
    public String deleteAccommodation(@PathVariable int id) {
        service.deleteAccommodation(id);
        return "Accommodation has been deleted!";
    }

    @DeleteMapping("/delete/stay/{id}")
    public String deleteStay(@PathVariable int id) {
        service.deleteStay(id);
        return "Stay has been deleted!";
    }
}
