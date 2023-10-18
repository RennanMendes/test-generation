package org.generation.generationstudents.infra.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Alunos Generation Brasil")
                        .description("API de cadastro de alunos de uma escola seguindo as instruções  propostas no desafio da Generation Brasil.\n\nAs tecnologias utilizadas no desenvolvimento desta API foram:\n - Linguagem de programação: Java\n - Banco de dados: PostgreSQL\n - Versionamento do banco de dados: Flyway ")
                        .version("0.0.1")
                        .contact(new Contact()
                                .name("por email")
                                .email("amrennan@gmail.com"))
                        .license(new License()
                                .name("Licença MIT")
                                .url("https://www.mit.edu/~amini/LICENSE.md"))

                );
    }

}
