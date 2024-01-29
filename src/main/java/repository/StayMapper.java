package repository;

import entity.StayEntity;
import entity.TripEntity;

public interface StayMapper {
  public void deleteStay(int id);
  public int insertStay(StayEntity stay);
}
