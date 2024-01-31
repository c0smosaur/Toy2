package repository;

import entity.TravelEntity;

import java.util.List;

public interface TravelMapper {
    List<TravelEntity> getAllTravel();
    public void deleteTravel(int id);

    TravelEntity getTravelById(Integer travelId);

}
