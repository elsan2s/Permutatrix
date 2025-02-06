package com.permutatrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;

@SpringBootApplication
public class PermutatrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PermutatrixApplication.class, args);

		// Mano eu to usando essa merda pra fazer uns calculos me deixa em paz
		double churumino = 2;
		double churumina = 1;

		if(churumina > churumino){
			System.out.println("Parabens Churumina vc é a Big Person");
			churumina++;
		} else {
			System.out.println("Eu esperava mais dessa relaçao");
			churumino++;
		}
		System.out.println("Valor de churumina: " + churumina);
		System.out.println("Valor de churumino: " + churumino);
		}

	}
