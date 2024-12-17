package heart.mapper;

import org.apache.ibatis.annotations.Mapper;

import heart.model.HeartRate;

@Mapper
public interface InsertLTMapper {
	public  int setLT(HeartRate model);
}
