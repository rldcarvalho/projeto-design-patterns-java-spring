package projeto;
/*
Projeto Spring Boot gerado via Spring Initializr.
Os seguintes módulos foram selecionados:
 - Spring Data Jpa
 - Spring Web
 - H2 Database
 - OpenFeign

 Rodar e executar no navegador: http://127.0.0.1:8080/swagger-ui/index.html

 @autor rldcarvalho
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
