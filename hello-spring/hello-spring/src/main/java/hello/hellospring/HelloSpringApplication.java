package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		System.out.println("test");
		System.out.println("test2");
		System.out.println("reset Test");
		System.out.println("Stage Test");
	}

}

