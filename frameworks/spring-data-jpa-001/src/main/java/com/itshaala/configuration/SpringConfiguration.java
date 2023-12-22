package com.itshaala.configuration;

import jakarta.persistence.EntityManager;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.internal.SessionImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/it_shaala");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return driverManagerDataSource;
    }


    @Bean
    public CrudRepository getCrudRepo(){
        EntityManager entityManager = null;
        CrudRepository crudRepository = new SimpleJpaRepository(entityManager);

        return null;
    }

    /*@Bean
    EntityManager entityManager(){
        SessionFactoryImpl sf = ;
        EntityManager entityManager = new SessionImpl(sf);
    }*/


}
