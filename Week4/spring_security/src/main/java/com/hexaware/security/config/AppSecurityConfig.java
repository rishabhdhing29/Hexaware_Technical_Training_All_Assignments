package com.hexaware.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;
	
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		
		return provider;
	}
	/*
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		List<UserDetails> users =new ArrayList<UserDetails>();
	    users.add(User.withDefaultPasswordEncoder().username("rishabh").password("tiger").roles("USER").build());
	    users.add(User.withDefaultPasswordEncoder().username("king").password("lion").roles("USER").build());
	    return new InMemoryUserDetailsManager(users);	
	}
	*/
}
