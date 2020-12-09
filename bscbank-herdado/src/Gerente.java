// Gerente eh um Funcionario, ent�o herda da class funcion�rio
// ter� uma interface com class autencitael
// class filho
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public  Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	
	// utilizando PROTECT na class m�e(funcion�rio)
//	public double getBonificacao() {
//		return super.getBonificacao() + super.salario; // salario n�o � atributo do gerente e sim na class m�e. ent�o utiliza SUPER(subir de nivel) para pegar esse salario da classe m�e. 
//		// mesma reescrita, ou seja, mesmo getBonificado da class m�e(funcionario)
//	}

	// retiranto o protected na class m�e. podemos usar chamando o super.getSalario.
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do gerente");
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
