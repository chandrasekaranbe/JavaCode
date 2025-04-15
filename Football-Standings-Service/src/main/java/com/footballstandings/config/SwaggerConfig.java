package com.footballstandings.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Football Standings API", version = "1.0", description = "Find Football Standings"))
public class SwaggerConfig {}
