package br.com.dev.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiCOnfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Dev Santander")
                        .version("v1")
                        .description("")
                        .termsOfService("https://localhost")
                        .license(
                                new License()
                                        .name("")
                                        .url("https://localhost")
                        )
                );
    }

}