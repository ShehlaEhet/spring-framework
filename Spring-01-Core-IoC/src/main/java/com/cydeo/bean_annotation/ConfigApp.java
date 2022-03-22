package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){

        return new FullTimeMentor();
    }

  //  @Primary
    //ParTimeMentor parTimeMentor(){
      //  return new ParTimeMentor();


    @Bean
    ParTimeMentor parTimeMentor(){

        return new ParTimeMentor();
    }
}
