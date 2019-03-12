package me.home.before30.homesandbox.springboot2sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
//@EnableAutoConfiguration
public class Springboot2SampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Hello World");
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
}

