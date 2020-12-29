import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Curso {
	
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
    
//    @Override
//    public String toString() {
//    	return "nome: " + this.nome + ", qtd alunos: " + this.alunos;
//    }
    
}

public class ExemplosCursos{
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		// o de cima e abaixo são as mesmas coisas
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.forEach(System.out::println); // precisa ser reescrito o método toString dentro da class Curso
		// abaixo não será necessário a reescrita do método toString utilizando LAMBDA
		cursos.forEach(assunto -> System.out.println(assunto.getNome()));
		
		System.out.println("------------------");
		
		// verificar qual curso tem mais de 100 alunos:
		cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(qtd -> System.out.println(qtd.getNome())); // stream devolve uma seguencia de objetos
		
		System.out.println("------------------");
		// pode ser escrito como acima ou abaixo
		cursos.stream() // stream devolve uma seguencia de objetos
			.filter(c -> c.getAlunos() >= 100)
			.forEach(nomeCurso -> System.out.println(nomeCurso.getNome())); 
		
		System.out.println("------------------");
		
		// verificar quantos alunos tem dentro de cada curso.
		cursos.stream() // stream devolve uma seguencia de objetos
			.filter(c -> c.getAlunos() >= 100)
			.map(c -> c.getAlunos()) // dados um curso quantos alunos tem dentro deles.
			.forEach(totalAlunos -> System.out.println(totalAlunos));
		
		System.out.println("------------------");

		// verificar quantos alunos tem dentro de cada curso.
		// pode ser no formato acima ou de baixo.
		int sum = cursos.stream() // stream devolve uma seguencia de objetos
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos) // dados um curso quantos alunos tem dentro deles.
			.sum();
		System.out.println(sum);
		
		System.out.println("------------------");
		
		// 
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny() // retorne um curso com mais de 100 alunos.
			.ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("------------------");
		
		// sair de uma stream e retorna para uma collection
		// filtrado em uma nova lista de Cuso chamado de resultado.
		Map<String, Integer> map = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		System.out.println(map);
		
		System.out.println("------------------");
		
		// o de acima é igual o de baixo
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
			.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

		
		
	}
}