package heart.controllerTest;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import heart.controller.HeartRateController;
import heart.model.HeartRate;
import heart.service.MaxHeartRateService;

@WebMvcTest(HeartRateController.class)
//MyBatisを使う用意
@AutoConfigureMybatis
public class HeartRateControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MaxHeartRateService service;

    @Test
    public void testRegistRate() throws Exception {
        // モックの動作を設定
        doNothing().when(service).setHeartRate(any(HeartRate.class));

        // POSTリクエストをシミュレーション
        mockMvc.perform(
                post("/maxHeart")
                    .contentType("application/x-www-form-urlencoded")
                    .param("id", "1")
                    .param("LTHeartRate", "135")
                    .param("maxHeartRate", "183"))
            .andExpect(status().isOk()) // ステータスコード200を期待
            .andExpect(view().name("/maxHeart")); // ビュー名が"/maxHeart"であることを確認

        // サービスメソッドが正しく呼び出されたか確認
        verify(service, times(1)).setHeartRate(any(HeartRate.class));
    }
}
