package heart.controller;

import static org.hamcrest.CoreMatchers.*;
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
import heart.mapper.LoginMapper;
import heart.service.InsertLtService;
import heart.service.LoginService;

@WebMvcTest(LoginController.class)

@Import(SecurityConfig.class) // SecurityConfigを適用

//MyBatisを使う用意
@AutoConfigureMybatis
public class LoginControllerTest {
	//Autowiredでインスタンス化を省略
	@Autowired
	MockMvc mockMvc;

	@MockBean
	LoginService loginService;

	@MockBean
	LoginMapper loginMapper;
	
	//なぜMockBeanと追加しなければテストが通らないか調査する必要あり
	@MockBean 
	private InsertLtService insertLtService;

	@WithMockUser(username = "test_user1", roles = { "USER" })
	@Test
	public void test_display() throws Exception {
		mockMvc.perform(
				get("/login"))
				//ステータスが２００か
				.andExpect(status().isOk())
				//loginを返すか
				.andExpect(view().name("login"))
				//loginを含むか
				.andExpect(content().string(containsString("ログイン")));
	}

}
