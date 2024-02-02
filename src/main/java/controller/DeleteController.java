package controller;

import model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.AccommodationMapper;
import repository.StayMapper;
import repository.TravelMapper;
import repository.TripMapper;
import service.DeleteService;

@RestController
@RequestMapping("/delete")
public class DeleteController {
    @Autowired
    private DeleteService service;

    @DeleteMapping("/travel/{id}")
    public ResponseEntity<Result<Object>>
    deleteTravel(@PathVariable int id) throws Exception {
        service.deleteTravel(id);
        Result<Object> response = successBuilder("Travel has been deleted!");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/trip/{id}")
    public ResponseEntity<Result<Object>>
    deleteTrip(@PathVariable int id) throws Exception {
        service.deleteTrip(id);
        Result<Object> response = successBuilder("Trip has been deleted!");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
    @DeleteMapping("/accommodation/{id}")
    public ResponseEntity<Result<Object>>
    deleteAccommodation(@PathVariable int id) throws Exception {
        service.deleteAccommodation(id);
        Result<Object> response = successBuilder("Accommodation has been deleted!");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/stay/{id}")
    public ResponseEntity<Result<Object>>
    deleteStay(@PathVariable int id) throws Exception {
        service.deleteStay(id);
        Result<Object> response = successBuilder("Stay has been deleted!");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    public Result<Object> successBuilder(Object obj){
        return Result.builder()
                .resultCode(""+ HttpStatus.OK.value())
                .resultMessage(HttpStatus.OK.getReasonPhrase())
                .data(obj)
                .build();
    }
}
