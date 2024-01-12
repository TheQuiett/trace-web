package com.example.demo.cofnig;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration()
@EntityScan("com.example.demo.entity")
@EnableJpaRepositories(
        basePackages = "com.example.demo.repository"
)
@EnableTransactionManagement()
public class DatabaseConfig {
}
