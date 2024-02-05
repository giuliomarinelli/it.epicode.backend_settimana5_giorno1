package it.epicode.w5d1.bean;

import lombok.Data;

@Data // include tutto in automatico
public abstract class Veicolo {
    private String nome;
    private String marca;
    private int numeroRuote;
}
