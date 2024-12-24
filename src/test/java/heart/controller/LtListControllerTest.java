package heart.controller;

import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import heart.config.SecurityConfig;

@WebMvcTest(LoginController.class)

@Import(SecurityConfig.class) // SecurityConfigを適用@Import(SecurityConfig.class) // SecurityConfigを適用

//MyBatisを使う用意
@AutoConfigureMybatis
public class LtListControllerTest {
	@Autowired
	MockMvc mockMvc;

}
