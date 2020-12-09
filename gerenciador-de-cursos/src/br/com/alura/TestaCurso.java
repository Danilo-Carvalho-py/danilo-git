package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");		
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
		
//		aulas.add(new Aula("Revisitando as ArrayLits", 21));
//		System.out.println(aulas);
//		System.out.println(javaColecoes.getAulas());
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLits", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula ", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		System.out.println(javaColecoes.getAulas());
		//System.out.println(aulas);
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
	}

}
