package de.cpg.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.templateresolver.TemplateResolver;
import org.thymeleaf.templateresolver.UrlTemplateResolver;

@SpringBootApplication
@EnableZuulProxy
public class SpringSsiApplication {

	@Bean
	public TemplateResolver urlTemplateResolver() {
		return new UrlTemplateResolver();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSsiApplication.class, args);
	}
}
