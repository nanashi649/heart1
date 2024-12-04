package heart.controllerTest;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import heart.config.SecurityConfig;
import heart.controller.LoginController;
import heart.mapper.LoginMapper;
import heart.service.LoginService;

@WebMvcTest(LoginController.class)
@Import(SecurityConfig.class)  // カスタムセキュリティ設定を読み込む
public class ControllerTest {
	//Autowiredでインスタンス化を省略
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	LoginService loginService;
	
	@MockBean
	LoginMapper loginMapper;
	
	@Test
	public void test_display() throws Exception{
		mockMvc.perform(
				get("/login")
				.param("test_user1", "password")
				)
		//ステータスが２００か
		.andExpect(status().isOk())
		//loginを返すか
		.andExpect(view().name("login"))
		//loginを含むか
		.andExpect(content().string(containsString("ログイン")))
		;
	}
	

	}
