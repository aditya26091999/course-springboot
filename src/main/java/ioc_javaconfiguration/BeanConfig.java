package ioc_javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Find the Beans that are marked with @Component explicitly in their code
@ComponentScan(basePackages = "ioc_javaconfiguration")
public class BeanConfig {

    //POJOs defined as beans in the BeanConfig Class
    @Bean
    public Nurse nurse(){
        return new Nurse();
    }
}
