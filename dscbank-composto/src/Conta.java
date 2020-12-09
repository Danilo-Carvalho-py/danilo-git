public class Conta{
	private double saldo; // quando o atributo � privado n�o pode ser lido ou alterado por ninguem. � conhecido como encapsulamento
	int agencia;
	int numero;
	Cliente titular;
	
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
}