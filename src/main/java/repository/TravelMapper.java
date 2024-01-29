package repository;


import entity.TravelEntity;

public interface TravelMapper {

  public int insertTravel(TravelEntity travel);
    public void deleteTravel(int id);
}
