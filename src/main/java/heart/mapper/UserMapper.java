package heart.mapper;



import org.apache.ibatis.annotations.Mapper;

import heart.model.UserModel;

@Mapper
public interface UserMapper {
	public int insertUser(UserModel userModel);
}
