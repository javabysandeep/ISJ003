package com.itshaala.configuration;

import com.itshaala.util.AppUtil;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfig {

    //traditional way
    /*@Bean
    public DataSource getMySqlDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/it_shaala");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }*/

    @Bean
    public DataSource getMySqlDataSource() {
        Properties properties = AppUtil.getProperties();
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(properties.getProperty("mysql-db-driver-class"));
        driverManagerDataSource.setUrl(properties.getProperty("mysql-db-url"));
        driverManagerDataSource.setUsername(properties.getProperty("mysql-db-username"));
        driverManagerDataSource.setPassword(properties.getProperty("mysql-db-password"));
        return driverManagerDataSource;
    }


    @Bean
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getMySqlDataSource());
        return jdbcTemplate;
    }


}
