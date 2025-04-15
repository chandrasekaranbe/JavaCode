package com.footballstandings.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id ="customEndpoint")
public class CustomActuatorEndpoint {

    @ReadOperation
    public  String CustomMessage(){
        return "Football Standing Service";
    }
}
