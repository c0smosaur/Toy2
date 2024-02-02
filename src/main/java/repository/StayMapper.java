package repository;

import entity.StayEntity;

import java.util.Map;

public interface StayMapper {
  public int insertStay(StayEntity stay);
  public int updateStay(Map map);
  public int deleteStay(int id);
}
