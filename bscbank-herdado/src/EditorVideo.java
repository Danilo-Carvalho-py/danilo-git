// Gerente eh um funcion�rio, ent�o herda da class funcion�rio
// class filho
public class EditorVideo extends Funcionario {

	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do editor de video");
		return 150;
	}
	
}
