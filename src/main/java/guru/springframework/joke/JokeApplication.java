package guru.springframework.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/*so we are saying to spring, read the xml configuration where are declared some bean that will be injected*/
@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeApplication.class, args);
    }

}



