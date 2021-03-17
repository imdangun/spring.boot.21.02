package spring.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import spring.boot.ch06.ex01.web.MyLoginHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
			.antMatchers("/", "/ch06/ex01/main", "/ch06/ex01/loginIn").permitAll() // 인증 없이 접근할 수 있다.
			.anyRequest().authenticated() // url별 설정 후, 마지막에 기술해야 한다.
			.and()
		.formLogin()
			.loginPage("/ch06/ex01/loginIn")
			.loginProcessingUrl("/ch06/ex01/login")
			.usernameParameter("userId")
			.passwordParameter("userPw")
			.successHandler(new MyLoginHandler())
			.and() // HttpSecurity http 객체를 반환한다.
		.logout()
			.logoutUrl("/ch06/ex01/logout")
			.logoutSuccessUrl("/ch06/ex01/main");
	}
}
