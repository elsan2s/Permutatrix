package com.permutatrix;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.permutatrix.Model.User;

@SpringBootApplication
public class PermutatrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(PermutatrixApplication.class, args);

		User user1 = new User( "Nicole", "nick_milgoles@gmail.com", "1234");
		Scanner sn = new Scanner(System.in);

		ArrayList<String> tarefasDaCasa = new ArrayList<String>();
		
		tarefasDaCasa.add("Levar Lixo");
		tarefasDaCasa.add("Lavar Louça");
		tarefasDaCasa.add("Lavar Roupa");
		tarefasDaCasa.add("Varrer a Casa");
		tarefasDaCasa.add("Passar Pano na Casa");
		tarefasDaCasa.add("Realizar Contabilidade");
		
		System.out.println("Esses são os serviços da casa: ");

		for (String tarefa : tarefasDaCasa) {
			System.out.println("- " + tarefa);
		}
		
		System.out.println("Digite o nome de quem vai realizar as tarefas: ");
		String nomeDigitado = sn.nextLine();

		user1.setNome(nomeDigitado);

		System.out.println("Nome salvo: " + user1.getNome());

		sn.close();
	}
}
