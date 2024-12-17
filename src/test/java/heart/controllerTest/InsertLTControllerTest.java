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
import org.springframework.context.annotation.Import;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import heart.config.SecurityConfig;
import heart.controller.InsertLTController;
import heart.model.HeartRate;
import heart.service.InsertLTService;

@WebMvcTest(InsertLTController.class)
//MyBatisを使う用意
@AutoConfigureMybatis
@Import(SecurityConfig.class)
public class InsertLTControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private InsertLTService service;
    
    
    @WithMockUser(username = "test_user1", roles = {"USER"})
    @Test
    public void testRegistRate() throws Exception {
    	
    	// パラメータで送信する日付の文字列（例： "1997-10-27"）
        String currentDate = "1997-10-27";


        // POSTリクエストをシミュレーション
        mockMvc.perform(
                post("/insertLTController")
                    .contentType("application/x-www-form-urlencoded")
                    .param("id", "1")
                    .param("LTHeartRate", "135")
                    .param("currentDate", currentDate))
            .andExpect(status().isOk()) // ステータスコード200を期待
            .andExpect(view().name("myLT")); // ビュー名が"/MaxHeartRate"であることを確認

        // サービスメソッドが正しく呼び出されたか確認
        verify(service, times(1)).setLT(any(HeartRate.class));
    }
}

