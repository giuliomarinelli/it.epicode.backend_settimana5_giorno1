package it.epicode.w5d1;

import it.epicode.w5d1.bean.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class W5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(W5d1Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// ho creato un contesto con tutti i bean dell'app
//		Persona p = context.getBean(Persona.class); // Prendo il bean di tipo Persona e lo salvo, se ho un solo bean per quella classe
		Persona p = context.getBean("p2", Persona.class);
//		Persona p = (Persona) context.getBean("p1"); // Restituisce Object, va fatto il down-casting
		System.out.println(p);

		Persona personaConVeicoli = context.getBean("personaConVeicoli", Persona.class);

		System.out.println(personaConVeicoli);

		context.close();

	}

}
