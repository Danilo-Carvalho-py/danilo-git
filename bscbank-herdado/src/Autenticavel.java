
// todos os metodos dentro de interface s�o abstratos
// mudamos de class para interface
// interface - � uma class abstrata com todos os metodos abstratos. N�o existe nada concreto
// POdemos ter v�rias interfaces
// Outro nome dado para as interfaces pe ASSINAR CONTRATO

public abstract interface Autenticavel {

	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
