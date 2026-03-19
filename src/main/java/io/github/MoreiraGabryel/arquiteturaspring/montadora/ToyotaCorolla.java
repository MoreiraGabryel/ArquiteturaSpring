package io.github.MoreiraGabryel.arquiteturaspring.montadora;

import java.awt.*;

public class ToyotaCorolla extends Carro{
    public  ToyotaCorolla (Motor motor){
        super(motor);
        setModelo("Corolla");
        setCor(Color.white);
        setMontadora(Montadora.TOYOTA);
    }


}
