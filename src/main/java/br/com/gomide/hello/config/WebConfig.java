package br.com.gomide.hello.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${cors.originPatterns:}")
    private String corsOriginPatterns;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Divide as origens configuradas e remove espaços extras
        String[] allowedPatterns = corsOriginPatterns.split(",");
        for (int i = 0; i < allowedPatterns.length; i++) {
            allowedPatterns[i] = allowedPatterns[i].trim();
        }

        registry.addMapping("/**")
                .allowedOrigins("*") // Permite todas as origens
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite métodos HTTP
                .allowCredentials(true); // Permite envio de credenciais
    }
}
