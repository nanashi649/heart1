package heart.serviceTest;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.Import;

import heart.config.SecurityConfig;
import heart.mapper.UserMapper;
import heart.service.UserService;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Import(SecurityConfig.class)
public class UserServiceTest {
	@Autowired
	UserService userService;
	
	@Mock
	UserMapper userMapper;
	
	@BeforeEach
	void setUp() {
	    MockitoAnnotations.openMocks(this); // モックの初期化
	    
	}
	
	
}
