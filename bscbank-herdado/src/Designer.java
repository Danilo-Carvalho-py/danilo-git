// Gerente eh um funcion�rio, ent�o herda da class funcion�rio
// class filho
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Designer");
		return 200;
	}
	
}
