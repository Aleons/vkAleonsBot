package ru.aleons.vkAleonsBot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@ComponentScan("ru.aleons.vkAleonsBot")
@EnableWebMvc
public class SpringWebConfig extends WebMvcConfigurerAdapter {

}
