public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente danilo = new Cliente();
		danilo.nome = "Danilo Carvalho";
		danilo.cpf = "222.222.222-22";
		danilo.profissao = "Engenheiro";
		
		Conta contaDoDanilo = new Conta();
		contaDoDanilo.deposita(100);
		
		// associa a cliente danilo a conta contaDoDanilo
		contaDoDanilo.titular = danilo;
		System.out.println(contaDoDanilo.titular.nome);
		System.out.println(contaDoDanilo.titular);
		System.out.println(danilo);
		
	}

}
