package br.com.alura.dscbank;

import br.com.dscbank.banco.modelo.Conta;
import br.com.dscbank.banco.modelo.ContaCorrente;

public class TesteBibliteca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.3);
		
		System.out.println(conta.getSaldo());
		
	}

}
