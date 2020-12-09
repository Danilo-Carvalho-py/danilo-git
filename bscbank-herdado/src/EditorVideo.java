// Gerente eh um funcionário, então herda da class funcionário
// class filho
public class EditorVideo extends Funcionario {

	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do editor de video");
		return 150;
	}
	
}
