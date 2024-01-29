package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TravelService;

@Controller
public class DeleteController {

    @Autowired
    private TravelService service;

    @GetMapping("/delete/travel/{id}")
    public String deleteTravel(@PathVariable int id) {
        service.deleteTravel(id);
        return "Travel이 삭제되었습니다!";
    }

    @GetMapping("/delete/trip/{id}")
    public String deleteTrip(@PathVariable int id) {
        service.deleteTrip(id);
        return "Trip이 삭제되었습니다!";
    }
    @GetMapping("/delete/accommodation/{id}")
    public String deleteAccommodation(@PathVariable int id) {
        service.deleteAccommodation(id);
        return "Accommodation이 삭제되었습니다!";
    }

    @GetMapping("/delete/stay/{id}")
    public String deleteStay(@PathVariable int id) {
        service.deleteStay(id);
        return "Stay가 삭제되었습니다!";
    }
}
