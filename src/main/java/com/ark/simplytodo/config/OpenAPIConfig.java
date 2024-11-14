package com.ark.simplytodo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI todoList() { //change this
        return new OpenAPI()
                .info(new Info()
                        .title("todolist")
                        .description("Documentation todolist api")
                        .version("1.0.0")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://www.apache.org/licenses/LICENSE-2.0"))
                        .contact(new Contact()
                                .name("todo list")
                                .url("http://todolist ark.com")
                                .email("contact.todolist@gmail.com")))
                .addServersItem(new Server().url("/"));
    }
}

