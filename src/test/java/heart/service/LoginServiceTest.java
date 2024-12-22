package heart.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import heart.mapper.LoginMapper;
import heart.model.LoginModel;

@ExtendWith(MockitoExtension.class)
public class LoginServiceTest {

	//テスト対象にmockを注入
	@InjectMocks
	LoginServiceImpl serviceImpl;
	//mapperをmock化
	@Mock
	LoginMapper mapper;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this); // モックの初期化
	}

	@Test
	public void findAll() {
		LoginModel loginModel = new LoginModel();
		// モックのセットアップ データを入力
		loginModel.setId("1");
		loginModel.setUsername("user1");
		loginModel.setPassword("password");

		//loginModelを返す
		when(mapper.findUsername("1")).thenReturn(loginModel);
		
		// テスト対象のメソッドを呼び出す
        LoginModel result = serviceImpl.findUsername("1");
        
        assertEquals(loginModel,result);
	}

}
