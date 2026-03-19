package io.github.MoreiraGabryel.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.module.Configuration;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaspringApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

		// Banir o banner de inicialização do Spring {alias muito bom }
		builder.bannerMode(Banner.Mode.OFF);

		//Pegar um Bean que está dentro do container atráves desse metodo

		ConfigurableApplicationContext applicationContext = builder.context();
		// Vai dar erro pq nao tem Bean

		 var produtoRepository = applicationContext.getBean("produtoRepository");

		 //metodo de produção
		builder.profiles("producao");

		// nao correto fazer isso aqui mas vai que um dia precisa fazer um debug
		builder.properties();

		// Rodar a builder com o respectivo metodo.
		builder.run(args);


	}

}
