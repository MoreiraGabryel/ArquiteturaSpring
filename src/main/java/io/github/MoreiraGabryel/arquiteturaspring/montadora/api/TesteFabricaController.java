package io.github.MoreiraGabryel.arquiteturaspring.montadora.api;

import io.github.MoreiraGabryel.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/carros")
public class TesteFabricaController {
        @Autowired
        //@Aspirado
        @Eletrico
        //@Turbo

        /*
        Específicar o Bean se por acaso ter Bean do mesmo tipo
         @Qualifier("motorTurbo")
        */
        private Motor motor;

        @PostMapping
        public CarroStatus ligarCarro (@RequestBody Chave chave) {
            var carro = new HondaHRV(motor);
         return carro.darIgnicao(chave);

        }



}
