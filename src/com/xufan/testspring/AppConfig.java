package com.xufan.testspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	public hello2 helloWorld() {
        return new hello2();
    }
}
