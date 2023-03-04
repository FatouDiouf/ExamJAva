package com.isi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.authentication.logout.LogoutHandler;

@SpringBootApplication
public class ExamJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamJavaApplication.class, args);
	}

    @Bean
    public LogoutHandler logoutHandler() {
        return null ;
    }
}
