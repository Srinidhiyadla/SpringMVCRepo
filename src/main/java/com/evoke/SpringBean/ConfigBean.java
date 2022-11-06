package com.evoke.SpringBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigBean {
	
	@Bean
	@Scope(value="singleton")
    public BeanClass MyBean() {
		return new BeanClass();
	}

}
