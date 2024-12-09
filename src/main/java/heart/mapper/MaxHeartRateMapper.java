package heart.mapper;

import org.apache.ibatis.annotations.Mapper;

import heart.model.HeartRate;

@Mapper
public interface MaxHeartRateMapper {
	public int setHeartModel(HeartRate model);
}
