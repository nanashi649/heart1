package heart.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import heart.model.HeartRate;

@MybatisTest
public class InsertLTMapperTest {
	
	private final InsertLtMapper mapper;
	
	public InsertLTMapperTest(InsertLtMapper mapper) {
		this.mapper = mapper;
	}

	@Test
	public void MapperTest() {
		HeartRate model = new HeartRate();
		//テストデータ挿入
		model.setId("1");
		model.setLTHeartRate(137);
		model.setCurrentDate(LocalDate.of(1997, 10, 27));

		int result = mapper.saveLT(model);
		assertEquals(result, 1);
	}
}
