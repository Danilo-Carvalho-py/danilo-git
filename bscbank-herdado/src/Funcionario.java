// class m�e
// � abstract pq o funcion�rio � uma classe gen�rica, ou seja, o funcion�rio � gerente, designer, Editor de V�deo, etc... e esses tipos de fun��es s�o concretos.
// n�o pode instanciar dessa classe, pq � abstrato.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//protected double salario; // protected est� entre private e public. protected vai se tornar publico para os filho(gerente)
	private double salario;
	
	// metodo abstract, n�o h� implementa��o
	public abstract double getBonificacao();
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
