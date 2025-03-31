package heart.controller;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import heart.controller.menu.MyLTController;
import heart.model.HeartRate;
import heart.service.AuthService;
import heart.service.MyLTService;

@WebMvcTest(MyLTController.class)
public class MyLTControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MyLTService service;

    @MockBean
    private AuthService authService;

    private HeartRate heartRate;

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
    void testMyLT_ReturnsHeartRateData() throws Exception {
        // `authService.getLoggedInUserId()` が "101" を返すように設定
        when(authService.getLoggedInUserId()).thenReturn("101");

        // `service.findLT("101")` を呼び出すと `heartRate` を返すように設定
        when(service.findLT("101")).thenReturn(heartRate);

        // MockMvc を使って GET /myLT を実行し、レスポンスの検証
        mockMvc.perform(get("/myLT"))
                .andExpect(status().isOk()) // HTTP ステータス 200 (OK)
                .andExpect(model().attributeExists("ltList")) // Model に ltList があるか
                .andExpect(model().attribute("ltList", Collections.singletonList(heartRate))) // データが一致するか
                .andExpect(view().name("myLT")); // myLT.html が正しく返されるか
    }

    @WithMockUser(username = "testUser", roles = {"USER"})
    @Test
    void testMyLT_ReturnsEmptyList_WhenNoData() throws Exception {
        // ユーザーID をモック
        when(authService.getLoggedInUserId()).thenReturn("101");
        when(service.findLT("101")).thenReturn(null); // データなし

        mockMvc.perform(get("/myLT"))
                .andExpect(status().isOk()) // HTTP 200
                .andExpect(model().attributeExists("ltList")) // Model に ltList が存在する
                .andExpect(model().attribute("ltList", Collections.emptyList())) // 空リストが渡される
                .andExpect(view().name("myLT"));
    }
}
