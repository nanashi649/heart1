package heart.controllerTest;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import heart.mapper.UserMapper;
import heart.service.UserService;

@WebMvcTest
public class UserControllerTest {
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	UserService userService;
	
	@MockBean
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
