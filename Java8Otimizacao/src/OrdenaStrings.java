import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// ordenamento de String pelo modelo velho
		// vai ser impresso em ordem alafabetica (lexicogr�fica).
		// Est� ordenando conforme o crit�rio de compra��o de uma String e esta Classe �
		// implementada por Compareble
		// .. e � comparada de A-Z
//		Collections.sort(palavras);
//		System.out.println(palavras);

		// est� ordenando por tamanho da string.
//		Comparator<String> comparador = new ComparadorPorTamanho();
//		Collections.sort(palavras, comparador);
		Collections.sort(palavras);
		System.out.println(palavras);

		System.out.println("----------------");

		// LAMBDA-> funciona sempre em uma interface onde se tem UM m�todo abstrado
		// (inteface funcional)
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

		// abaixo uma nova forma de itera��o diferente do sort acima

		// LAMBDA SERVE PARA COMPARATOR - CONSUMER

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// a linha de cima pode ter esse formato abaixo

		palavras.sort(Comparator.comparing(s -> s.length()));
		// o de cima e abaixo s�o iguais.
		palavras.sort(Comparator.comparing(String::length));

		// a linha de cima mais destalhada fica da seguinte forma:

		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);

		System.out.println(palavras);

		System.out.println("----------------");

		Consumer<String> impressor = s -> System.out.println(s);
		// o de cima e abaixo s�o iguais
		Consumer<String> impressor2 = System.out::println;

		palavras.forEach(impressor);
		System.out.println("----------------");
		palavras.forEach(impressor2);

		System.out.println("----------------");

		for (String p : palavras) { // Para cada String "p" dentro de "palavras", fa�a:
			System.out.println(p);
		}

		// abaixo uma nova forma de itera��o diferente do foreach acima

		System.out.println("----------------");

		// LAMBDA-> funciona sempre em uma interface onde se tem m�todo m�todo abstrado
		// (inteface funcional)

		palavras.forEach(palavra -> System.out.println(palavra));
		System.out.println("----------------");
		// o de cima e abaixo s�o iguais
		palavras.forEach(System.out::println);

	}
}
