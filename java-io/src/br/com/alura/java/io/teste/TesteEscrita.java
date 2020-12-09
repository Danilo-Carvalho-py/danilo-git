package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		// fluxo de entrada de um Arquivo para leitura de uma linha inteira.		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis); // tranforma bytes em caracteres
		BufferedReader br = new BufferedReader(isr); // juntar varias caracteres de uma linha
		
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
				
		br.close();
	}

}
