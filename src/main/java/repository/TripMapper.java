package repository;

import entity.TripEntity;

import java.util.List;

public interface TripMapper {
  int insertTrip(TripEntity trip);
  void deleteTrip(int id);

    List<TripEntity> getAllTrip();

}
