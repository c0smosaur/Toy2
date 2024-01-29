package repository;

public interface StayMapper {
  public void deleteStay(int id);
import entity.StayEntity;
import entity.TripEntity;

public interface StayMapper {

  public int insertStay(StayEntity stay);
}
