
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoDanilo = new Conta();
		contaDoDanilo.saldo = 100;
		contaDoDanilo.deposita(50);
		System.out.println(contaDoDanilo.saldo);
		
		if (contaDoDanilo.saca(50)) {
			System.out.println("o novo saldo é: " + contaDoDanilo.saldo);
		}else {
			System.out.println("saldo insuficiante");
		}
		
		Conta contadaSandra = new Conta();
		contadaSandra.deposita(1000);
		
		if (contadaSandra.transfere(300, contaDoDanilo)) {
			System.out.println("Tranferencioa com sucesso"
					+ "o novo saldo é: " + contadaSandra.saldo);
		}else {
			System.out.println("saldo insuficiente");
		}
		
		System.out.println(contadaSandra.saldo);
		System.out.println(contaDoDanilo.saldo);
		
		
	}
}
