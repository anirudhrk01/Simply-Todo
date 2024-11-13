package com.ark.simplytodo.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

@Endpoint(id = "todo-actuator-endpoint")
public class TodoActuatorEndpoint {
    @ReadOperation
    public String customOperation(){

        return "To-Do endpoint info";
    }
}
