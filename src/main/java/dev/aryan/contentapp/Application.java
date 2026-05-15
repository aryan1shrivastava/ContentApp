package dev.aryan.contentapp;

import dev.aryan.contentapp.config.ContentAppProperties;
import dev.aryan.contentapp.model.Content;
import dev.aryan.contentapp.model.Status;
import dev.aryan.contentapp.model.Type;
import dev.aryan.contentapp.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentAppProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			// insert data into database

			Content c = new Content(null,
					"A new Video",
					"test video",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");

			repository.save(c);
		};
	}

}
