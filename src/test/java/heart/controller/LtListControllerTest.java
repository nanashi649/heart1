//package heart.controller;
//
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import java.util.Arrays;
//
//import org.junit.jupiter.api.Test;
//import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.web.servlet.MockMvc;
//
//import heart.config.SecurityConfig;
//import heart.mapper.LtListMapper;
//import heart.model.UserModel;
//import heart.service.LtListService;
//
//@WebMvcTest(LtListController.class)
//
//@Import(SecurityConfig.class) // SecurityConfigを適用@Import(SecurityConfig.class) // SecurityConfigを適用
//
////MyBatisを使う用意
//@AutoConfigureMybatis
//public class LtListControllerTest {
//	@Autowired
//	MockMvc mockMvc;
//	
//	@MockBean
//	LtListService service;
//
//	@MockBean
//	LtListMapper mapper;
//	
//	
//	@Test
//	public void test_play() throws Exception {
//		  UserModel user1 = new UserModel();
//		  user1.setUsername("student_A");
//		  user1.setLTHeartRate(135);
//		  user1.setGroupName("〇〇中学校△△部");
//		  
//		  UserModel user2 = new UserModel();
//		  user2.setUsername("user2");
//		  user2.setLTHeartRate(80);
//		  user2.setGroupName("〇〇中学校△△部");
//		  
//		  when(service.findUsername("id")).thenReturn(Arrays.asList(user1));
//		
//		mockMvc.perform(get("/lt_list"))
//				.andExpect(status().isOk()) // ステータスが200 OKであることを確認
//				.andExpect(view().name("lt_list")) // ビュー名が "lt_list" であることを確認
//				.andExpect(model().attributeExists("data")); //"data" 属性が存在することを確認
//	}
//
//}
