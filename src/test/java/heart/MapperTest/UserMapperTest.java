package heart.MapperTest;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import heart.mapper.UserMapper;
import heart.model.UserModel;

@MybatisTest
public class UserMapperTest {
	@Autowired
	private UserMapper userMappper;
	
	@Test
	public void userMapperTest() {
		UserModel model = new UserModel();
		model.setId("1");
		model.setUsername("test_user1");
		model.setPassword("1");
		model.setBirthday(LocalDate.of(1997, 10, 27));
		
		//insertUserをもちいてデータを挿入
		int result = userMappper.insertUser(model);
		
		//結果を判定
		if(result==1) {
			System.out.println("正常に追加されました");
		}else {
			System.err.println("失敗");
		}
	}
}
