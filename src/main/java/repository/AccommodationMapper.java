package repository;

import entity.AccommodationEntity;
import entity.TripEntity;

public interface AccommodationMapper {

  public int insertAccommodation(AccommodationEntity accommodation);
  public void deleteAccommodation(int id);
}
