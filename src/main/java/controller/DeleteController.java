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

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        service.deleteTravel(id);
        service.deleteTrip(id);
        service.deleteAccommodation(id);
        service.deleteStay(id);
        return "Hello from delete:)!";
    }
}
