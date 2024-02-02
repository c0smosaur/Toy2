package repository;

import entity.TripEntity;

import java.util.List;
import java.util.Optional;

import java.util.Map;

public interface TripMapper {
  public int updateTrip(Map map);
  public int deleteTrip(int id);
  int insertTrip(TripEntity trip);

    List<TripEntity> getAllTrip();
    Optional<TripEntity> getTrip(Integer tripId);
}
