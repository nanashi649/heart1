package heart.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import heart.mapper.LoginMapper;
import heart.model.LoginModel;

@Service
public class ServiceImple implements LoginService {
	
	@Autowired
    private LoginMapper loginMapper;


	@Override
	public String getUsername(int id) {
		// TODO 自動生成されたメソッド・スタブ
		LoginModel loginmodel = loginMapper.getUsername(id);
		return loginmodel.getUsername();
		}

	//loginModel型を返す
	@Override
	public LoginModel getModel(String username, String password, LocalDate date) {
		// TODO 自動生成されたメソッド・スタブ
        return loginMapper.getModel(username, password, date);
	}
	
}
