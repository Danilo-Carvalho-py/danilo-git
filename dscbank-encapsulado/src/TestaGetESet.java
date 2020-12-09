
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente danilo = new Cliente();
		
		conta.setTitular(danilo);
		
		danilo.setNome("Danilo Carvalho");
		
		System.out.println(conta.getTitular().getNome());
	}
}
