package br.com.senacniteroi.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * ARQUITETURA MVC
 * 
 * MODELS - SERÃO O MODELO DAS REQUISIÇÕES
 * VIEWS - FRONTEND PRONTO QUE EXIBIRÁ O RESULTADO DAS RQUISIÇÕES
 * CONTROLLERS - VÃO ADMINISTRAR AS REQUISIÇÕES
 * SERVICES - VÃO "SERVIR" AS REQUISIÇÕES
 * 
 * 
 * 
 * 
 * 
 * 
 */
@SpringBootApplication
public class SpringbootapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootapiApplication.class, args);
	}

}
