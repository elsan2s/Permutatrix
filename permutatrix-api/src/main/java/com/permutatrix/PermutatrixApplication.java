package com.permutatrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;

@SpringBootApplication
public class PermutatrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PermutatrixApplication.class, args);

		// Mano eu to usando essa merda pra fazer uns calculos me deixa em paz
		double pao = 60.00;
		double leite = 100.00;
		double cafe = 100.00;
		double ovo = 100;
		//Mistura e o que tava vivo e morreu (para o ovo nao se sentir ofendido)
		double mistura = 300;

		double cafeDaManha = pao + leite + cafe;
		double almoco = (ovo + mistura)/2;
		double janta = (ovo + mistura)/2;

	}

	public static double refeicoesMes(double almoco, double janta, double cafeDaManha){
		return almoco+janta+cafeDaManha;
	}

}
