package heart.serviceTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import heart.mapper.UserMapper;
import heart.model.UserModel;
import heart.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
	//Mockを利用するクラス
	@InjectMocks
	UserServiceImpl service;
	
	@Mock
	UserMapper mapper;
	
	@Test
	public void testInsertUser() {
		UserModel model = new UserModel();
		model.setId("1");
		model.setUsername("test_user1");
		model.setPassword("1");
		model.setBirthday(LocalDate.of(1997,10,27));
		
		//Mock化しているでーたのため、モックしたオブジェクト
		//は実際の動作をおこなわない。
		 // モックの振る舞いを設定
        // UserMapperのinsertUserメソッドが呼ばれたときに1を返すように設定する
		when(mapper.insertUser(model)).thenReturn(1);

	    // 実際にサービスメソッドを呼び出して確認
		//１が返って生きたらOK
		int result = service.insertUser(model);
		assertEquals(1,result);
		
	}
	
}
