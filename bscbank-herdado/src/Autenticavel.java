
// todos os metodos dentro de interface são abstratos
// mudamos de class para interface
// interface - é uma class abstrata com todos os metodos abstratos. Não existe nada concreto
// POdemos ter várias interfaces
// Outro nome dado para as interfaces pe ASSINAR CONTRATO

public abstract interface Autenticavel {

	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
