package heart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import heart.mapper.UserMapper;
import heart.model.UserModel;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper mapper;
	
	@Override
	public int insertUser(UserModel model) {
		// // 挿入処理をマッパーに委譲
		return mapper.insertUser(model);
	}
	
	

}
