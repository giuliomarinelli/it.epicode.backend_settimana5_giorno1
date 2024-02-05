package it.epicode.w5d1.bean;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Persona {
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private List<Veicolo> veicoli;

    // non metto i costruttori, get, set... perché sono richiamati attraverso le annotation di Lombok
}
