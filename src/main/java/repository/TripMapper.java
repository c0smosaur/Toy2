package repository;

import entity.TripEntity;
public interface TripMapper {
  public void deleteTrip(int id);
  public int insertTrip(TripEntity trip);
}
