package heart.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
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
	
	public LoginMapperTest(LoginMapper mapper) {
		this.mapper = mapper;
	}
	
	@Test
	public void testGetUsername() {
		LoginModel expected = new LoginModel();
	    expected.setId("1");
	    expected.setUsername("test_user1");
	    expected.setPassword("password");
	    
	    // 実際の結果を取得
	    LoginModel actual = mapper.findUsername("1");
	    
	    assertEquals(expected, actual);
	}
}
