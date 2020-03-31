package fr.cci.formationobjet.java.PaintFront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("fr.cci.formationobjet.java.PaintFront")
public class PaintFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaintFrontApplication.class, args);
	}

}
