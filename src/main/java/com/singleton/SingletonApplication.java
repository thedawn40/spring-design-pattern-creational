package com.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * SingletonApplication
 */
@SpringBootApplication
public class SingletonApplication {

    @Bean
    public Counter counter(){
        return new Counter();
    }
    
}