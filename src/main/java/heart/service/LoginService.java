package heart.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import heart.mapper.LoginMapper;
import heart.model.LoginModel;

@Service
public class LoginService implements UserDetailsService {

	private final LoginMapper loginMapper;

	public LoginService(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		LoginModel user = loginMapper.findUsername(id);

		if (user == null) {
			throw new UsernameNotFoundException("ユーザーが見つかりません: " + id);
		}

		return User.builder()
				.username(user.getId()) // `id` を `username` として扱う
				.password(user.getPassword()) // `password` を設定
				.roles("USER") // 権限を設定
				.build();
	}
}
