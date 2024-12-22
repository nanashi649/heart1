package heart.mapper;

import org.apache.ibatis.annotations.Mapper;

import heart.model.LoginModel;

@Mapper
public interface LoginMapper {

	public LoginModel findUsername(String id);
}
