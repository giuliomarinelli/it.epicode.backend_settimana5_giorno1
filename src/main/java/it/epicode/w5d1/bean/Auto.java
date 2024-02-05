package it.epicode.w5d1.bean;

import lombok.Data;

@Data
public class Auto extends Veicolo {
    private int numeroPorte;

    @Override
    public String toString() {
        return super.toString() +
                " numeroPorte=" + numeroPorte;
    }
}
