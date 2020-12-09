public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// nome do m�todo SACA
	// void significa que n�o ter� retorno de nenhuma informa��o.
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