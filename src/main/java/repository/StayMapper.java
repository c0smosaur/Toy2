package repository;

import entity.StayEntity;

public interface StayMapper {
  public int insertStay(StayEntity stay);
  public void deleteStay(int id);
}
