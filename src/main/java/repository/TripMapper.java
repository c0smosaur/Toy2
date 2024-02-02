package repository;

import entity.TripEntity;

import java.util.List;
import java.util.Optional;

public interface TripMapper {
  int insertTrip(TripEntity trip);
  void deleteTrip(int id);

    List<TripEntity> getAllTrip();
    Optional<TripEntity> getTrip(Integer tripId);
}
