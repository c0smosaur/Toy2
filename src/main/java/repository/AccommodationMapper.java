package repository;

import entity.AccommodationEntity;

public interface AccommodationMapper {

  public int insertAccommodation(AccommodationEntity accommodation);
  public int updateAccommodation(AccommodationEntity accommodation);
  public void deleteAccommodation(int id);
}
