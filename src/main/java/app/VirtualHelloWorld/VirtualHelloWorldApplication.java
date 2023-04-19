package app.VirtualHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VirtualHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualHelloWorldApplication.class, args);
	}
	@RestController
	public class DemoController {

		@RequestMapping("/")
		public String index() {
			return "Hello Tomcat";
		}
	}
}
