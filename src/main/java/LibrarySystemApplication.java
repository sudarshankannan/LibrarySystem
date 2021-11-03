

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan({"com.example.controllers"})
public class LibrarySystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibrarySystemApplication.class, args);
	}
}