package ic.ecx.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	private final Environment environment;

	@PostConstruct
	public void init(){
		List<String> activeProfiles = Arrays.asList(environment.getActiveProfiles());
		System.out.println(activeProfiles);
		System.out.println("*************************sss*");

	}

	public Application(Environment environment) {
		this.environment = environment;
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
