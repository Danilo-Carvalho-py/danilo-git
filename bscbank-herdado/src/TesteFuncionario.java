
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente nico = new Gerente(); //new Gerente está chamando o CONSTRUTOR
		

		nico.setNome("Nico Steppat");
		nico.setCpf("222.222.222-22");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 300.00;
		
	}
}
