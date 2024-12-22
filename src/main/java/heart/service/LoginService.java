package heart.service;

import org.springframework.stereotype.Service;

import heart.model.LoginModel;

@Service
public interface LoginService {
	public LoginModel findUsername(String id);

}
