package com.ark.simplytodo.config;


import com.ark.simplytodo.actuator.TodoActuatorEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActuatorConfig {

    @Bean
    public TodoActuatorEndpoint todoActuatorEndpoint(){
        return new TodoActuatorEndpoint();
    }
}
