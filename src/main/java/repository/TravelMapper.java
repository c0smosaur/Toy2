package repository;

import entity.TravelEntity;

import java.util.List;
import java.util.Map;

public interface TravelMapper {
    public int insertTravel(TravelEntity travel);
    List<TravelEntity> getAllTravel();
    TravelEntity getTravelById(Integer travelId);
    public int updateTravel(Map map);
    public int deleteTravel(int id);
}
