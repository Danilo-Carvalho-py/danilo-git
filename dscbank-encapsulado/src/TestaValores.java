
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(12337, 24226); // os () esta invocando o construtor. 
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("o total de contas �: " + Conta.getTotal());
	}
}
