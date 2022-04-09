package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.coderslab.beans.*;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloMyBeautifulWorld(){
        return new HelloWorld();
    }
    @Bean
    public Captain jackSparrow() {
        return new Captain();
    }

    @Bean
    public Ship blackPearl() {
        return new Ship(jackSparrow());
    }
    @Bean
    public ScopeSingleton singleton(){
        return new ScopeSingleton();
    }
    @Bean
    @Scope("prototype")
    public ScopePrototype prototype(){
        return new ScopePrototype();
    }



}
