package it.epicode.w5d1;

import it.epicode.w5d1.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("p1")
    @Scope("singleton") // un unico oggetto istanziato e verrà restituito sempre lo stesso oggetto
    public Persona getPersona() {
        Persona p = new Persona();
        p.setNome("Mario");
        p.setCognome("Rossi");
        p.setDataNascita(LocalDate.parse("1991-06-16"));
        return p;
    }

    @Bean("p2")
    @Scope("prototype") // verrà sempre istanziato, ad ogni richiesta ci sarà un nuovo oggetto con un nuovo riferimento
    public Persona getPersona2() {
        Persona p = new Persona();
        p.setNome("Valentina");
        p.setCognome("Nerd");
        p.setDataNascita(LocalDate.parse("1992-05-25"));
        return p;
    }

    @Bean("panda")
    public Auto getPanda() {
        Auto a = new Auto();
        a.setNome("Panda");
        a.setMarca("Fiat");
        a.setNumeroPorte(3);
        a.setNumeroRuote(4);
        return a;
    }

    @Bean("ferrari")
    public Auto getFerrari() {
        Auto a = new Auto();
        a.setNumeroRuote(4);
        a.setNome("Spider");
        a.setMarca("Ferrari");
        a.setNumeroPorte(3);
        return a;
    }

    @Bean("ninja")
    public Moto getNinja() {
        Moto m = new Moto();
        m.setMarca("Kawasaki");
        m.setNome("Ninja");
        m.setTipologia(Tipologia.SUPERSPORT);
        m.setNumeroRuote(2);
        return m;
    }

    @Bean("personaConVeicoli")
    public Persona getPersonaConVeicoli() {
        Persona persona = new Persona();
        persona.setNome("Marta");
        persona.setCognome("Me");
        persona.setDataNascita(LocalDate.parse("1991-11-23"));
        List<Veicolo> veicoli = List.of(getPanda(), getFerrari(), getNinja());
        persona.setVeicoli(veicoli);
        return persona;
    }
}
