package com.hsbc.electronics.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan({"com.hsbc.electronics.model"})
@ComponentScan({ "com.hsbc.electronics.config", "com.hsbc.electronics.service","com.hsbc.electronics.repository","com.hsbc.electronics.controller","com.hsbc.electronics.model","hsbc.electronics.vehicle"})
@PropertySources({@PropertySource("classpath:messages.properties"), @PropertySource("classpath:log4j.properties")})
@EnableTransactionManagement
@EnableAsync
public class CoreApplicationConfiguration {

}