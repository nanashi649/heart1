package heart.service;

import org.springframework.beans.factory.annotation.Autowired;

import heart.mapper.UserMapper;
import heart.model.UserModel;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper mapper;
	
	@Override
	public int insertUser(UserModel model) {
		// // 挿入処理をマッパーに委譲
		return mapper.insertUser(model);
	}
	
	

}
