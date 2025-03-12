package heart.mapper;

import org.apache.ibatis.annotations.Mapper;

import heart.model.HeartRate;

@Mapper
public interface MyLTMapper {
	public HeartRate findLT(String id);
}
