package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turino");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sérgio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		List<String> alu = new ArrayList<>();
		alu.addAll(alunos);
		
		System.out.println(alu.get(2));
		
		System.out.println("-------------");
		
		alu.remove(alu.get(2));		
		System.out.println(alu);
		System.out.println("-------------");
		System.out.println(alunos);
		
		
		
		System.out.println(alunos);
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("-------------");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

	}

}
