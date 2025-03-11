package heart.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	public String getLoggedInUserId() {
		// SecurityContext から認証情報を取得
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		// 認証情報がない場合は例外をスロー
		if (authentication == null || !authentication.isAuthenticated()
				|| "anonymousUser".equals(authentication.getName())) {
			throw new IllegalStateException("ログインしていません");
		}

		return authentication.getName(); // ログインユーザーのID
	}
}
