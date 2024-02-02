package repository;

import entity.TripEntity;

import java.util.Map;

public interface TripMapper {
  public int insertTrip(TripEntity trip);
//  public int updateTrip(TripEntity trip);
  public int updateTrip(Map map);
  public int deleteTrip(int id);
}
