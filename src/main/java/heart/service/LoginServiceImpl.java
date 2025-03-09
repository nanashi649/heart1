package heart.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import heart.mapper.LoginMapper;
import heart.model.LoginModel;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private final LoginMapper mapper;
	
	public LoginServiceImpl(LoginMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public LoginModel findUsername(String id) {
		//IDが見つからないときの例外処理
		if(id == null ) {
			throw new NoSuchElementException("IDが見つかりません");
		}
		return mapper.findUsername(id);
	}


}
