
public class CriarConta {
	public static void main(String[] args) {
		// primeira conta
		Conta primeiraConta = new Conta(); // primeiraConta é uma referência do que contem dentro do Class Conta. primeiraConta é do tipo Conta;
		primeiraConta.saldo = 200;
		
		primeiraConta.saldo += 100;
		
		// segunda conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem: " + primeiraConta.saldo);
		System.out.println("A segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
	}
}
