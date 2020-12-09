
public class TesteDeReferencias {
	public static void main(String[] args) {
		Conta primeiraConta  = new Conta();
		
		// primeira conta
		primeiraConta.saldo = 300;
        System.out.println(primeiraConta.saldo);
        
        // segunda conta
        Conta segundaConta = primeiraConta;
        segundaConta.saldo += 100;
           
        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
		
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
        
	}
}
