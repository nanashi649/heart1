package heart.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import heart.model.HeartRate;

@MybatisTest
public class HeartRateMapperTest {

	private final MaxHeartRateMapper mapper;

	@Autowired
	public HeartRateMapperTest(MaxHeartRateMapper mapper) {
		this.mapper = mapper;
	}

	@Test
	public void MapperTest() {
		HeartRate model = new HeartRate();
		//テストデータ挿入
		model.setId("1");
		model.setMaxHeartRate(183);
		model.setLTHeartRate(137);

		int result = mapper.saveHeartModel(model);
		assertEquals(result, 1);

	}

}
