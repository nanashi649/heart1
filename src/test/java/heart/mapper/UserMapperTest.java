package heart.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import heart.model.UserModel;

@MybatisTest
public class UserMapperTest {

	private final UserMapper mapper;

	public UserMapperTest(UserMapper mapper) {
		this.mapper = mapper;
	}

	@Test
	public void userMapperTest() {
		UserModel model = new UserModel();
		model.setId("0");
		model.setUsername("test_user1");
		model.setPassword("1");
		model.setBirthday(LocalDate.of(1997, 10, 27));
		model.setGroupName("〇〇中学校");

		//insertUserをもちいてデータを挿入
		int result = mapper.insertUser(model);
		assertEquals(1, result);

	}
}
