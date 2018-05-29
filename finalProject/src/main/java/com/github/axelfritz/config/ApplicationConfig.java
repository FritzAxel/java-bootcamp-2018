package com.github.axelfritz.config;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;  
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;  
import springfox.documentation.builders.ApiInfoBuilder;  
import springfox.documentation.builders.PathSelectors;  
import springfox.documentation.builders.RequestHandlerSelectors;  
import springfox.documentation.service.ApiInfo;  
import springfox.documentation.service.Contact;  
import springfox.documentation.spi.DocumentationType;  
import springfox.documentation.spring.web.plugins.Docket;  
import springfox.documentation.swagger2.annotations.EnableSwagger2; 

@Configuration
@EnableSwagger2
@EnableWebSecurity
public class ApplicationConfig extends WebSecurityConfigurerAdapter {
	@Autowired  
	private BasicAuthenticationPoint basicAuthenticationPoint;  
	@Bean  
	public Docket api() {  
		return new Docket(DocumentationType.SWAGGER_2)  
				.apiInfo(getApiInfo())  
				.select()  
				.apis(RequestHandlerSelectors.basePackage("com.github.axelfritz.controller"))  
				.paths(PathSelectors.any())  
				.build();  
	}

	private ApiInfo getApiInfo() {  
		Contact contact = new Contact("Axel Fritz", "axel.fritz95@gmail.com");  
		return new ApiInfoBuilder()  
				.title("Final Project")  
				.contact(contact)  
				.build();  
	}  
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/carts").
		http.httpBasic().authenticationEntryPoint(basicAuthenticationPoint);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("axel").password("axel26");
	}
}