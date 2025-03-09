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
		int rowsAffected = mapper.insertUser(model);

		//1行も登録できなかった場合は例外をスロー
		if (rowsAffected == 0) {
			throw new IllegalStateException("ユーザ登録が行えません。登録するIDを変更して再度登録してください。");
		}
		// // 挿入処理をマッパーに委譲
		return mapper.insertUser(model);
	}

}
