public class Conta{
	private double saldo; // quando o atributo é privado não pode ser lido ou alterado por ninguem. é conhecido como encapsulamento
	private int agencia;
	private int numero;
	private Cliente titular; // quando faz relação com outra classe(cliente) é chamado de composição.
	private static int total = 0; // total é um atrtibuto da class, ou seja, vale para tudo. Diferente do NUMERO que é de uma instacia.

	// construtor
	// inicializado uma unica vez. diferente do método.
	// construtor pode receber parametros
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("o total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
	// nome do método
	// void significa que não terá retorno;
	public void deposita(double valor) { 
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if (novoNumero <= 0) {
			System.out.println("Não é permitido número menor ou igual a 0");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não é permitido número menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}