package heart.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import heart.model.HeartRate;

@MybatisTest
public class MyLTMapperTest {
	
	private final MyLTMapper mapper;
	
	@Autowired
	public MyLTMapperTest(MyLTMapper mapper) {
		this.mapper = mapper;
	}

	@Test
	public void MapperTest() {
	    // 取得するデータ
	    HeartRate result = mapper.findLT("101");

	    // null でないことを確認
	    assertNotNull(result, "取得結果が null ではないこと");

	    // 期待値と一致するか確認
	    assertEquals(137, result.getLTHeartRate(), "LTHeartRate が期待通り");
	    assertEquals(LocalDate.of(1997, 10, 27), result.getCurrentDate(), "CURRENT DATE が期待通り");
	}

}