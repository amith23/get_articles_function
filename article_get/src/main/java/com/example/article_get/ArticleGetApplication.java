package com.example.article_get;

import java.util.function.Function;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArticleGetApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ArticleGetApplication.class, args);
	}

	@Bean
	public Function<String, String> uppercase() {
		return value -> {
			if (value.equals("exception")) {
				throw new RuntimeException("Intentional exception");
			} else {
				return value.toUpperCase();
			}
		};
	}
}
