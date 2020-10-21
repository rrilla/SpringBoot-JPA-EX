package com.cos.security2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity	//시큐리티 설정파일 활성화
@Configuration	//IOC컨테이너 등록
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	//Web머시기를 상속받아서 자료형을 똑같이 만든 후 IOC컨테이너에 등록되어있는 
	//기존의 Web형태의 클래스를 덮어씌움,오버라이딩 ,, (IOC에는 부모형태의 타입으로 등록됨)
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();	//csrf 정책을 비활성화. postman,petch 사용할라모 해제해야함.
		
		//http.authorizeRequests()
		
		
		
	}
	
}
