package com.footballstandings;

import com.footballstandings.util.SSLUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
public class FootballStandingsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballStandingsServiceApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		SSLUtil.disableSSLVerification();
		return new RestTemplate();
	}

}
