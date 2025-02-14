package com.permutatrix;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.permutatrix.Model.User;

@SpringBootApplication
public class PermutatrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PermutatrixApplication.class, args);

		User user = new User();
		Scanner sn = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sn.nextLine();

		user.setNome(nome);

		System.out.println("Nome salvo: " + user.getNome());

		sn.close();
	}
}
