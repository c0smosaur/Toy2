package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/delete/travel/{id}")
    public String deleteTravel(@PathVariable int id) {
        travelMapper.deleteTravel(id);
        return "Travel이 삭제되었습니다!";
    }

    @GetMapping("/delete/trip/{id}")
    public String deleteTrip(@PathVariable int id) {
        tripMapper.deleteTrip(id);
        return "Trip이 삭제되었습니다!";
    }
    @GetMapping("/delete/accommodation/{id}")
    public String deleteAccommodation(@PathVariable int id) {
        accommodationMapper.deleteAccommodation(id);
        return "Accommodation이 삭제되었습니다!";
    }

    @GetMapping("/delete/stay/{id}")
    public String deleteStay(@PathVariable int id) {
        stayMapper.deleteStay(id);
        return "Stay가 삭제되었습니다!";
    }
}
