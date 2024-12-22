package heart.service;

import org.springframework.stereotype.Service;

import heart.mapper.UserMapper;
import heart.model.UserModel;

@Service
public class UserServiceImpl implements UserService {


	private final UserMapper mapper;
	
	public UserServiceImpl(UserMapper mapper) {
		this.mapper = mapper;
	}
	@Override
	public int insertUser(UserModel model) {
		// // 挿入処理をマッパーに委譲
		return mapper.insertUser(model);
	}

}
