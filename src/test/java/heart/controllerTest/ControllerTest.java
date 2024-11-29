package heart.controllerTest;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import heart.controller.LoginController;
import heart.mapper.LoginMapper;
import heart.service.LoginService;

@WebMvcTest(LoginController.class)
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
				.param("test_user", "1234")
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
