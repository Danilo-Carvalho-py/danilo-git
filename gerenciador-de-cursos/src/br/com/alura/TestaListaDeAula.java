package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisitando as ArrayLits", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas); // modificando método toString na classe aula.
		System.out.println("-----------");
		
		Collections.sort(aulas);
		
		System.out.println(aulas);// modificando método compareto na classe aula.
		
		System.out.println("-----------");
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // ordenando pelo tempo
		
		System.out.println(aulas);// modificando método compareto na classe aula.
		
		System.out.println("-----------");
		
		// pode ser feito do formato acima ou abaixo - comparator
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);// modificando método compareto na classe aula.
		
		
//		System.out.println(aulas.get(0).getTitulo());
//		System.out.println(aulas.get(0).getTempo());
//		
//		for (Aula aula : aulas) {
//			System.out.println(aula.getTitulo() + ", " + aula.getTempo());
//		}	
//		
//		System.out.println("-----------");
//		
//		aulas.forEach(aula -> {
//			System.out.println(aula.getTitulo() + ", " + aula.getTempo());
//		});
	
	}

}
