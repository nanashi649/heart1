package heart.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import heart.model.LoginModel;

@Service
public interface LoginService {
	public LoginModel  getModel(String username,String password,LocalDate date) ;

	public  String  getUsername(int i) ;
	
}
