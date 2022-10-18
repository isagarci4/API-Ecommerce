package br.edu.unasp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Cadastro de Produtos";
    }
    
}
