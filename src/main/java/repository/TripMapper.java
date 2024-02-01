package repository;

import entity.TripEntity;

public interface TripMapper {
  public int insertTrip(TripEntity trip);
  public int updateTrip(TripEntity trip);
  void deleteTrip(int id);
}
