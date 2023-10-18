package com.fawaz.order_management.adapter.out;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.fawaz.order_management.adapter.out")
@EnableJpaRepositories("com.fawaz.order_management.adapter.out")
public class JpaConfig {
}