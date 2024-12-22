package heart.service;

import org.springframework.stereotype.Service;

import heart.mapper.LoginMapper;
import heart.model.LoginModel;

@Service
public class LoginServiceImpl implements LoginService {

	private final LoginMapper mapper;
	
	public LoginServiceImpl(LoginMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public LoginModel findUsername(String id) {
		return mapper.findUsername(id);
	}


}
