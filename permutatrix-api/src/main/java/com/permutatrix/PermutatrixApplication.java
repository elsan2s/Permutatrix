package com.permutatrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;

@SpringBootApplication
public class PermutatrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PermutatrixApplication.class, args);

		Random random = new Random();
		int confianca = random.nextInt(100);
		System.out.println("Numero gerado para confianca:" + confianca);

		// Ignora essa merda eu tava cansado começaremos amanhã... hoje e dia de missa.
		if(confianca > 80) {
			System.out.println("Voce e burro cara");
		} else if (confianca < 20){
			System.out.println("Vai dormi tranquilo, vc precisa...");
		} else {
			System.out.println("Sabe o que deveria ter feito...");
		}
	}

}
