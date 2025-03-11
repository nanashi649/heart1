package heart;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class LoginHtmlTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * 1. ログインページの HTML が正しく表示されるか
     */
    @Test
    public void testLoginPageHtml() throws Exception {
        mockMvc.perform(get("/login"))
                .andExpect(status().isOk()) // ステータスコード 200
                .andExpect(view().name("login")) // `login.html` が返っているか
                .andExpect(content().string(containsString("<title>ログイン</title>"))) // タイトルが含まれているか
                .andExpect(content().string(containsString("<input type=\"text\" id=\"id\" name=\"id\" required>"))) // ユーザーID入力欄があるか
                .andExpect(content().string(containsString("<input type=\"password\" id=\"password\" name=\"password\" required>"))); // パスワード入力欄があるか
    }
}
