package heart.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import heart.mapper.InsertLtMapper;
import heart.model.HeartRate;

@ExtendWith(MockitoExtension.class)
public class InsertLTServiceTest {
	//Mockを利用するクラス
	@InjectMocks
	InsertLtServiceImpl service;

	@Mock
	InsertLtMapper mapper;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this); // モックの初期化
		service = new InsertLtServiceImpl(mapper); //コンストラクタ起動
	}

	@Test
	public void testInsertUser() {
		HeartRate model = new HeartRate();
		//テストデータ挿入
		model.setId("1");
		model.setLTHeartRate(137);
		model.setCurrentDate(LocalDate.of(1997, 10, 27));

		//Mock化しているでーたのため、モックしたオブジェクト
		//は実際の動作をおこなわない。
		// モックの振る舞いを設定
		// InsertLTMapperのsetLTメソッドが呼ばれたときに1を返すように設定する
		when(mapper.saveLT(model)).thenReturn(1);

		// 実際にサービスメソッドを呼び出して確認
		//１が返って生きたらOK
		int result = service.setLT(model);
		assertEquals(1, result);

	}

}
