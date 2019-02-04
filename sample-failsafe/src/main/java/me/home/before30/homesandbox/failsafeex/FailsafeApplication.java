package me.home.before30.homesandbox.failsafeex;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FailsafeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FailsafeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("hello world");
    }
}
