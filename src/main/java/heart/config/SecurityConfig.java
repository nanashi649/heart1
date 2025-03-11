package heart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import heart.service.LoginService; // ユーザー認証のためのサービス (UserDetailsService を実装)

@Configuration // Spring の設定クラスであることを示す
@EnableWebSecurity // Spring Security を有効化する
public class SecurityConfig {

    private final LoginService loginService; // ユーザー認証のためのサービス

    // コンストラクタで `LoginService` を受け取り、Spring によって自動注入される
    public SecurityConfig(LoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * **🛡️ SecurityFilterChain (Spring Security の設定)**
     * - 各リクエストのアクセス制御を設定する
     * - フォーム認証の設定を行う (`/login` でログイン)
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll() // H2 データベースコンソールは認証なしでアクセス可能
                        .requestMatchers(HttpMethod.POST, "/login").authenticated() // `POST /login` は認証が必要
                        .anyRequest().permitAll()) // それ以外のリクエストはすべて許可
                .formLogin(form -> form
                        .loginPage("/login") // カスタムログインページを `/login` に設定
                        .loginProcessingUrl("/login") // Spring Security の認証処理を `/login` で受け取る
                        .usernameParameter("id") // フォームの `id` フィールドをユーザー名として認識
                        .passwordParameter("password") // フォームの `password` フィールドをパスワードとして認識
                        .failureUrl("/login?error") // 認証失敗時に `/login?error` へリダイレクト
                        .defaultSuccessUrl("/top", true) // 認証成功時に `/top` へリダイレクト
                        .permitAll()) // 誰でもログインページにアクセス可能
                .logout(logout -> logout
                        .logoutUrl("/logout") // ログアウト処理のエンドポイント
                        .logoutSuccessUrl("/login?logout") // ログアウト後に `/login?logout` へリダイレクト
                        .permitAll())
                .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**")) // H2 コンソール用に CSRF を無効化
                .headers(headers -> headers.frameOptions(frame -> frame.disable())); // H2 のフレーム許可

        return http.build();
    }

    // 🔽 **認証マネージャを Spring Security のデフォルト設定で取得**
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    // 🔽 **パスワードエンコーダ**
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance(); // 🔹 そのまま比較
    }
}

