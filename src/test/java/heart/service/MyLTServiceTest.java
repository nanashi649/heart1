package heart.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import heart.mapper.MyLTMapper;
import heart.model.HeartRate;

@ExtendWith(MockitoExtension.class)
public class MyLTServiceTest {
	@Mock
	private MyLTMapper mapper;

	@InjectMocks
	private MyLTServiceImpl service;

	private HeartRate heartRate;

	@BeforeEach
	void setUp() {
		//テスト用dat作成
		heartRate = new HeartRate();
		heartRate.setId("101");
		heartRate.setLTHeartRate(137);
		heartRate.setCurrentDate(LocalDate.of(1997, 10, 27));
	}

	@Test
	void testFindLT() {
		//モックの設定;maaper.findLT("101)を呼び出したらheartRateを返す
		when(mapper.findLT("101")).thenReturn(heartRate);

		HeartRate result = service.findLT("101");

		//結果検証
		assertNotNull(result, "取得結果がnullではない");
		assertEquals(137, result.getLTHeartRate(), "LTHeartRate が期待通り");
		assertEquals(LocalDate.of(1997, 10, 27), result.getCurrentDate(), "CURRENT DATE が期待通り");

	}
}
