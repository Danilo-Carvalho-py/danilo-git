package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1); // adicionar dentro de uma lista(Objeto)
		aulas.add(aula2);
		aulas.add(aula3);
				
		System.out.println(aulas);
		
		aulas.remove(0); // remover na posição "0"
		
		System.out.println(aulas);
		
		System.out.println("-----------");
		
		for (String aula : aulas) { // como se lê: para cada String aula dentro de aulas
			System.out.println("Aula: " + aula);
		}
		
		System.out.println("-----------");
		System.out.println(aulas.size());
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		
		System.out.println("-----------");
		aulas.forEach(aula -> {
			System.out.println("pecorrendo:");
			System.out.println("Aula: " + aula);		
		});
		
		System.out.println("-----------");
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		
		System.out.println("-----------");
		Collections.sort(aulas); // coloca em ordem alfabética
		System.out.println(aulas);
				
	}
}
