package heart.serviceTest;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import heart.mapper.LoginMapper;
import heart.model.LoginModel;
import heart.service.ServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {
	
	//テスト対象にmockを注入
	@InjectMocks
	ServiceImpl serviceImple;
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
	        loginModel.setUsername("user1");
	        loginModel.setPassword("1234");
	        loginModel.setBirthday(LocalDate.of(1995, 11, 29));
				
	        //loginModelを返す
	        when(mapper.getModel("user1", "1234", LocalDate.of(1995, 11, 29))).thenReturn(loginModel);
 
	       
        LoginModel result = serviceImple.getModel("user1", "1234" ,LocalDate.of(1995, 11, 29));
        
        //アサーション：テスト
        assertThat(result.getUsername()).isEqualTo("user1");
        assertThat(result.getPassword()).isEqualTo("1234");
        assertThat(result.getBirthday()).isEqualTo( LocalDate.of(1995, 11, 29));
        verify(mapper).getModel("user1", "1234", LocalDate.of(1995, 11, 29));
        
	}
	
}
