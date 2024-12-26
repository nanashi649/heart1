package heart.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ContextConfiguration;

import heart.Heart1Application;
import heart.model.LoginModel;

@MybatisTest
@ContextConfiguration(classes = Heart1Application.class)
//設定したデータベースを利用
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LoginMapperTest {

		private final LoginMapper mapper;
		
		@Autowired
		public LoginMapperTest(LoginMapper mapper) {
			this.mapper = mapper;
		}

//	@Autowired
//	public LoginMapper mapper;

	@Test
	public void testGetUsername() {
		LoginModel expected = new LoginModel();
		expected.setId("101");
		expected.setUsername("student_A");
		expected.setPassword("password");

		// 実際の結果を取得
		LoginModel actual = mapper.findUsername("101");

		assertEquals(expected, actual);
	}
}
