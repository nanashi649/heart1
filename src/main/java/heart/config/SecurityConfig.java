package heart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

public class SecurityConfig {
	@Bean
	 SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http
		//httpリクエストの認可
		.authorizeHttpRequests(auth -> auth
		.requestMatchers(HttpMethod.POST,"/login/**").authenticated()
		.anyRequest().permitAll()
		)
		
		//フォームベース認証
		.formLogin(form -> form
			    .loginPage("/login")               // カスタムログインページを指定
			    .failureUrl("/login?failure")      // 認証失敗時のリダイレクト先を指定
			    .defaultSuccessUrl("/top", true)   // 認証成功時のリダイレクト先を指定
			);

		return http.build();
		
		
		
	}

}
