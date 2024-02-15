//package com.prem.config;
//
//import io.swagger.v3.oas.models.ExternalDocumentation;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public OpenAPI springShowOpenAPI(){
//        return new OpenAPI()
//                .info(new Info().title("Doctor Patient Portal API ")
//                        .description("The Doctor Patient Portal API is a backend system designed to facilitate the management of doctors and patients within a medical platform. It enables functionalities such as adding doctors with their specialties and patients with their symptoms, as well as suggesting doctors based on patient symptoms. The API ensures efficient registration and retrieval of medical professionals and patients, enhancing the overall experience and organization of medical services.")
//                        .version("v0.0.1")
//                        .license(new License().name("[Portfolio website] Prem Prakash").url("https://premprakash.site/")))
//                .externalDocs(new ExternalDocumentation()
//                        .description("LinkedIn Profile")
//                        .url("https://www.linkedin.com/in/premprakash-tech/"));
//
//    }
//}
