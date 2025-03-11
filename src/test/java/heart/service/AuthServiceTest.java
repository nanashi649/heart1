package heart.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.test.context.support.WithMockUser;

@SpringBootTest
public class AuthServiceTest {

	private final AuthService authService;

	@Autowired
	public AuthServiceTest(AuthService authService) {
		this.authService = authService;
	}

	@Test
	@WithMockUser(username = "nanashi1010") //モックユーザ設定
	public void testGetLoggedInUserId() {
		//テスト対象メソッドの呼び出し
		String userId = authService.getLoggedInUserId();

		//検証(モックユーザを取得できるか)
		assertEquals("nanashi1010", userId);
	}

	@Test
	public void testGetLoggedInUserId_withoutAuthentication() {
		SecurityContextHolder.clearContext(); // 認証情報をクリア

		Exception exception = assertThrows(IllegalStateException.class, () -> {
			authService.getLoggedInUserId();
		});

		assertEquals("ログインしていません", exception.getMessage());
	}
}
