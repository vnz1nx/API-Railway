package br.com.gomide.hello.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite que todas as rotas sejam acessíveis
                .allowedOrigins("*") // Permite qualquer origem (válido para testes)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite esses métodos HTTP
                .allowCredentials(true); // Permite o envio de credenciais
    }
}
