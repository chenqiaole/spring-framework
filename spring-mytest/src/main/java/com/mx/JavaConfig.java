package com.mx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author smart哥
 * <p>
 * 码炫课堂java技术交流q群：963060292
 */

@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user() {
		return new User("001", "smart哥");
	}
}