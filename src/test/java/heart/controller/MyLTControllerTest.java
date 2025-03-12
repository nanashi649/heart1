package heart.controller;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import heart.controller.menu.MyLTController;
import heart.mapper.MyLTMapper;
import heart.model.HeartRate;
import heart.service.AuthService;
import heart.service.MyLTService;

@WebMvcTest(MyLTController.class)

public class MyLTControllerTest {

	@Autowired
	private MockMvc mockMvc; // モック HTTP リクエストを送るためのクラス

	@MockBean
	private MyLTService service;

	@MockBean
	private AuthService authService;

	private HeartRate heartRate;

	@MockBean
	private MyLTMapper mapper; // MyBatisのMapperをモック化

	@BeforeEach
	void setUp() {
		// テスト用のデータを作成
		heartRate = new HeartRate();
		heartRate.setId("101");
		heartRate.setLTHeartRate(137);
		heartRate.setCurrentDate(LocalDate.of(1997, 10, 27));
	}

	@WithMockUser(username = "testUser", roles = {"USER"})
	@Test

	void testMyLT() throws Exception {
		// `authService.getLoggedInUserId()` が "101" を返すように設定
		when(authService.getLoggedInUserId()).thenReturn("101");

		// `myLTService.findLT("101")` を呼び出すと `testHeartRate` を返すように設定
		when(service.findLT("101")).thenReturn(heartRate);

		//"myLT"のGETリクエスト
		mockMvc.perform(get("/myLT"))
				.andExpect(status().isOk());// HTTP ステータスが 200 (OK)

	}

}
