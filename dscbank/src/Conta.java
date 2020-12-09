public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// nome do método SACA
	// void significa que não terá retorno de nenhuma informação.
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
}