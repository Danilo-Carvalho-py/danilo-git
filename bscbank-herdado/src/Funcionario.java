// class mãe
// É abstract pq o funcionário é uma classe genérica, ou seja, o funcionário é gerente, designer, Editor de Vídeo, etc... e esses tipos de funções são concretos.
// não pode instanciar dessa classe, pq é abstrato.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//protected double salario; // protected está entre private e public. protected vai se tornar publico para os filho(gerente)
	private double salario;
	
	// metodo abstract, não há implementação
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
