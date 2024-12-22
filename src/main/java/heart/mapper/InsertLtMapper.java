package heart.mapper;

import org.apache.ibatis.annotations.Mapper;

import heart.model.HeartRate;

@Mapper
public interface InsertLtMapper {
	public int saveLT(HeartRate model);
}
