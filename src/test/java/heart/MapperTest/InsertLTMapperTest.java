package heart.MapperTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import heart.mapper.InsertLTMapper;
import heart.model.HeartRate;

@MybatisTest
public class InsertLTMapperTest {
	@Autowired
	InsertLTMapper mapper;
	
	@Test
	public void MapperTest() {
		HeartRate model = new HeartRate();
		//テストデータ挿入
		model.setId("1");
		model.setLTHeartRate(137);
		model.setCurrentDate(LocalDate.of(1997, 10, 27));
		
		int result = mapper.setLT(model);
		assertEquals(result,1);
	}
}
