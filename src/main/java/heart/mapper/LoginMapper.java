package heart.mapper;



import java.time.LocalDate;

import org.apache.ibatis.annotations.Mapper;

import heart.model.LoginModel;

@Mapper
public interface LoginMapper {
	
	public LoginModel getUsername(int id);
	
	public LoginModel getModel(String username, String password, LocalDate date);
}



	