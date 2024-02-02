package repository;

import entity.AccommodationEntity;

import java.util.Map;

public interface AccommodationMapper {

  public int insertAccommodation(AccommodationEntity accommodation);
  public int updateAccommodation(Map map);
  public int deleteAccommodation(int id);
}
