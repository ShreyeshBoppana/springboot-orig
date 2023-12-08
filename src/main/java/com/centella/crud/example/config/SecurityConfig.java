/*package com.centella.crud.example.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig
{
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		UserDetails user=User.builder().username("Shreyesh").password(passwordEncoder().encode("pwd1")).roles("ADMIN").build();
		UserDetails user1=User.builder().username("robot").password(passwordEncoder().encode("pwd2")).roles("USER").build();
		return new InMemoryUserDetailsManager(user,user1);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	
}*/