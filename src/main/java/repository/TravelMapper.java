package repository;

import entity.TravelEntity;

import java.util.List;
import java.util.Optional;

public interface TravelMapper {
    public int insertTravel(TravelEntity travel);
    List<TravelEntity> getAllTravel();
    Optional<TravelEntity> getTravelById(Integer travelId);
    public void deleteTravel(int id);
}
