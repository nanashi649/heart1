package heart.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import heart.mapper.LtListMapper;
import heart.model.UserModel;

@ExtendWith(MockitoExtension.class)
public class LtListServiceTest {
	//テスト対象にmockを注入
		@InjectMocks
		LtListServiceImpl serviceImpl;
		
		//mapperをmock化
		@Mock
		LtListMapper mapper;
		
		@BeforeEach
		void setUp() {
			MockitoAnnotations.openMocks(this); // モックの初期化
			serviceImpl = new LtListServiceImpl(mapper);
		}
		
		@Test
		public void findUserTest() {
			UserModel model = new UserModel();
			
			model.setId("101");
			model.setGroupName("〇〇中学校△△部");
			model.setUsername("student_A");
			
			//loginModelを返す
			List<UserModel> userList = List.of(model);
			when(mapper.findUsername("〇〇中学校△△部")).thenReturn(userList);
			
			// テスト対象のメソッドを呼び出す
	        List<UserModel> results = serviceImpl.findUsername("〇〇中学校△△部");
	        UserModel result = results.get(0);
	        assertEquals("101", result.getId());
	        assertEquals("student_A", result.getUsername());
	        assertEquals("〇〇中学校△△部", result.getGroupName());
		}
}
