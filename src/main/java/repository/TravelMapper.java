package repository;

import entity.TravelEntity;

import java.util.List;

public interface TravelMapper {
    public int insertTravel(TravelEntity travel);
    List<TravelEntity> getAllTravel();
    TravelEntity getTravelById(Integer travelId);
    public void deleteTravel(int id);
}
