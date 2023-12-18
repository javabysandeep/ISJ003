package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean(name = "product")
    public Product getProduct() {
        return new Product(101, "Mobile", 8989);
    }

}
