public class Conta{
	private double saldo; // quando o atributo é privado não pode ser lido ou alterado por ninguem. é conhecido como encapsulamento
	int agencia;
	int numero;
	Cliente titular;
	
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
}