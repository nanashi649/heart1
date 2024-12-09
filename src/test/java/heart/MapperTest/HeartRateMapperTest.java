package heart.MapperTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import heart.mapper.MaxHeartRateMapper;
import heart.model.HeartRate;

@MybatisTest
public class HeartRateMapperTest {
	@Autowired
	MaxHeartRateMapper mapper;
	
	@Test
	public void MapperTest() {
		HeartRate model = new HeartRate();
		//テストデータ挿入
		model.setId("1");
		model.setMaxHeartRate(183);
		model.setLTHeartRate(137);
		
		
		int result = mapper.setHeartModel(model);
		assertEquals(result,1);
		
	}
	
}
