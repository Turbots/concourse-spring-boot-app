package be.turbots.concourse.pipelinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConcoursePipelineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcoursePipelineDemoApplication.class, args);
	}

	@Bean
	public Moo lala() {
		System.out.println("MOO");

		return new Moo();
	}

	private static class Moo {
		
	}
}
