package heart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import heart.model.UserModel;


@Mapper
public interface LtListMapper {
	public List<UserModel> findUsername(String groupName);
}
