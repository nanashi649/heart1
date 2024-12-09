package heart.controllerTest;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import heart.controller.UserRegistrationController;
import heart.mapper.UserMapper;
import heart.service.UserService;

//MyBatisを使う用意
@AutoConfigureMybatis
@WebMvcTest(UserRegistrationController.class)
public class UserControllerTest {
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	 private SqlSessionFactory sqlSessionFactory; // SqlSessionFactoryをモック化
	
	 @MockBean
	 private UserService userService; // UserServiceをモック化することで依存関係を解決
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void registration_test() throws Exception{
		mockMvc.perform(
				//Getリクエストを送信
				get("/userregistration"))
				//ステータスがOKか
				.andExpect(status().isOk())
		
				.andExpect(view().name("userregistration"))
				
				.andExpect(content().string(containsString("ユーザ登録")))
				;
	}
	
	@Test
	public void post_test() throws Exception {
		mockMvc.perform(
				post("/userregistration"))
		
				.andExpect(status().isOk());
				
	}
}
