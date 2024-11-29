package heart.MapperTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ContextConfiguration;

import heart.Heart1Application;
import heart.mapper.LoginMapper;
import heart.model.LoginModel;

@MybatisTest
@ContextConfiguration(classes = Heart1Application.class)
//設定したデータベースを利用
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LoginMapperTest {
	@Autowired
	private LoginMapper loginMapper;
	
	@Test
	public void testGetUsername() {
	//usernameプロパティのみ取り出すためにオブジェクト化
	LoginModel loginModel = loginMapper.getUsername(1);
	//データベースに登録しているidをもとにデータを取得、登録しているusernameとあっているかテスト
	assertEquals("test_user1", loginModel.getUsername());
	System.out.println("Username" + loginModel.getUsername());
	}
}
