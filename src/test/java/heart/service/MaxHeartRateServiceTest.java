package heart.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import heart.mapper.MaxHeartRateMapper;
import heart.model.HeartRate;

@ExtendWith(MockitoExtension.class)
public class MaxHeartRateServiceTest {

	@InjectMocks
	MaxHeartRateServiceImpl service;

	@Mock
	MaxHeartRateMapper mapper;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this); // モックの初期化
	}

	@Test
	public void serviceTest() {
		HeartRate model = new HeartRate();
		model.setId("1");
		model.setLTHeartRate(135);
		model.setMaxHeartRate(183);

		//mapperのsetHeartModelが起動したとき戻り値１を返す
		when(mapper.saveHeartModel(model)).thenReturn(1);

		int result = service.saveHeartRate(model);
		assertEquals(result, 1);
	}
}
