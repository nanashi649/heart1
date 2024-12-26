package heart.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import heart.model.HeartRate;

@MybatisTest
public class InsertLTMapperTest {
	
	private final InsertLtMapper mapper;
	
	@Autowired
	public InsertLTMapperTest(InsertLtMapper mapper) {
		this.mapper = mapper;
	}

	@Test
	public void MapperTest() {
		HeartRate model = new HeartRate();
		//テストデータ挿入
		model.setId("101");
		model.setLTHeartRate(137);
		model.setCurrentDate(LocalDate.of(1997, 10, 27));

		int result = mapper.saveLT(model);
		assertEquals(result, 1);
	}
}
