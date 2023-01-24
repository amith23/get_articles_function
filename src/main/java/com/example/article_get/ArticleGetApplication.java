package com.example.article_get;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArticleGetApplication {

	public static void main(String[] args) {
		 SpringApplication.run(ArticleGetApplication.class, args);
	}

	@Bean
	public Function<String, List<String>> getList() {

		List<String> articles = new ArrayList<>();

		return value -> articles;

	}
}
