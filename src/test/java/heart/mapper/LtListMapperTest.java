package heart.mapper;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ContextConfiguration;

import heart.Heart1Application;
import heart.model.UserModel;

@MybatisTest
@ContextConfiguration(classes = Heart1Application.class)
//設定したデータベースを利用
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LtListMapperTest {
	private final LtListMapper mapper;
	
	@Autowired
	public LtListMapperTest(LtListMapper mapper) {
		this.mapper = mapper;
	}

	@Test
	void testFindusername() {

		List<UserModel> users = mapper.findUsername("〇〇中学校△△部");
		
		UserModel user = users.get(0);

		// Assert: 結果の検証
		assertThat(user.getId()).isEqualTo("101"); // ユーザーIDを検証（期待値に合わせて修正）
		assertThat(user.getUsername()).isEqualTo("student_A"); // ユーザー名を検証
		assertThat(user.getLTHeartRate()).isEqualTo(135); // ハートレートを検証
	}
}
