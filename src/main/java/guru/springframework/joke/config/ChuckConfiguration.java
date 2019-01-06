package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckConfiguration {

    /*We have a bean inside a configuration class and will be created in the list of bean and ready to be injected where we want
    * it is exactly like a @controller,@service etc. only because it is inside a @Configuration class.
    * Or if we comment we can do towards xml configurations and rembeber in the application class use
    * @ImportResource("classpath:chuck-config.xml") like annotation to say read that xml file configuration
    * */
    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    };

}
