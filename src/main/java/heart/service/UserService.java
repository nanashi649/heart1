package heart.service;

import org.springframework.stereotype.Service;

import heart.model.UserModel;

@Service
public interface UserService {
	public int insertUser(UserModel model);
}
