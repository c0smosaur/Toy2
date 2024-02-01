package repository;

import entity.StayEntity;

public interface StayMapper {
  public int insertStay(StayEntity stay);
  public int updateStay(StayEntity stay);

  public void deleteStay(int id);
}
