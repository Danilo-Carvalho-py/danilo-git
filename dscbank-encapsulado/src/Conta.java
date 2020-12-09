public class Conta{
	private double saldo; // quando o atributo � privado n�o pode ser lido ou alterado por ninguem. � conhecido como encapsulamento
	private int agencia;
	private int numero;
	private Cliente titular; // quando faz rela��o com outra classe(cliente) � chamado de composi��o.
	private static int total = 0; // total � um atrtibuto da class, ou seja, vale para tudo. Diferente do NUMERO que � de uma instacia.

	// construtor
	// inicializado uma unica vez. diferente do m�todo.
	// construtor pode receber parametros
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("o total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
	// nome do m�todo
	// void significa que n�o ter� retorno;
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
			System.out.println("N�o � permitido n�mero menor ou igual a 0");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o � permitido n�mero menor ou igual a 0");
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