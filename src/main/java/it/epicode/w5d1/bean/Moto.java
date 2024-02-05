package it.epicode.w5d1.bean;

import lombok.Data;

@Data
public class Moto extends Veicolo {
    private Tipologia tipologia;

    @Override
    public String toString() {
        return super.toString() +
                " tipologia=" + tipologia;
    }
}
