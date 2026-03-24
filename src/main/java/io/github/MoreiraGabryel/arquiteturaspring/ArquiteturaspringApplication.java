package io.github.MoreiraGabryel.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {

		// 1. Instanciamos o builder apontando para a classe correta (ArquiteturaspringApplication)
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);

		// 2. Desativa o Banner (Alias muito bom mesmo para logs limpos)
		builder.bannerMode(Banner.Mode.OFF);

		// 3. Define o Profile (Opcional)
		// builder.profiles("producao");

		// 4. Executa a aplicação e captura o contexto
		ConfigurableApplicationContext context = builder.run(args);

		// 5. Agora você pode buscar Beans com segurança
		// var produtoRepository = context.getBean("produtoRepository");
		// System.out.println("Contexto iniciado com sucesso!");
	}
}