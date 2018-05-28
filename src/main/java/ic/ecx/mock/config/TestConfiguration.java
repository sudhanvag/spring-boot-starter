package ic.ecx.mock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

/**
 * @author sgnaneshwar
 */

@Configuration
public class TestConfiguration {

    @Profile("dev")
    @Bean
    public TestBean testBean(){
        return new TestBean();
    }

    public static class TestBean{
        private String name;

        @PostConstruct
        public void init(){
            System.out.println("TestBean invoked");
        }
    }
}
