package io.github.MoreiraGabryel.arquiteturaspring.montadora.configuration;

import io.github.MoreiraGabryel.arquiteturaspring.montadora.Motor;
import io.github.MoreiraGabryel.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ Configuration
public class MontadoraConfiguration {

   /**
     * CRIANDO OS MOTORES COM SEUS BEAN NOMEADOS PARA AJUDAR NA CHAMADA DO TESTE FABRICA CONTROLLER
     * BEANS Do mesmo tipos
     * Outro jeito para específicar o BEAN
     * Dizendo que esse é o primário
     * O Spring busca o Primário
     * @PRIMARY
     */
    @Bean( name = "motorAspirado")

    public Motor motorAspirado () {
         var motor = new Motor ();
         motor.setCavalos(120);
         motor.setCilindros(4);
         motor.setModelo("XPTO - O ");
         motor.setLitragem(2.0);
         motor.setTipo(TipoMotor.ASPIRADO);
         return motor;
    }
    @Bean(name = "motorTurbo")
    public Motor motorTurbo () {
        var motor = new Motor ();
        motor.setCavalos(100);
        motor.setCilindros(3);
        motor.setModelo("XPTO - 4 ");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
    @Bean(name = "motorEletrico")
    public Motor motorEletrico () {
        var motor = new Motor ();
        motor.setCavalos(100);
        motor.setCilindros(3);
        motor.setModelo("APEX-12 ");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }
}
