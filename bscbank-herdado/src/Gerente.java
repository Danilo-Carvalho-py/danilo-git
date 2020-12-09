// Gerente eh um Funcionario, então herda da class funcionário
// terá uma interface com class autencitael
// class filho
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public  Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	
	// utilizando PROTECT na class mãe(funcionário)
//	public double getBonificacao() {
//		return super.getBonificacao() + super.salario; // salario não é atributo do gerente e sim na class mãe. então utiliza SUPER(subir de nivel) para pegar esse salario da classe mãe. 
//		// mesma reescrita, ou seja, mesmo getBonificado da class mãe(funcionario)
//	}

	// retiranto o protected na class mãe. podemos usar chamando o super.getSalario.
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
